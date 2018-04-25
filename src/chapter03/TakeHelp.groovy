def takeHelp(helper){
    helper.helpMoveThings();
    if (helper.metaClass.respondsTo(helper,'eatSugarcane'))
        helper.eatSugarcane()
}

class Man {
    void helpMoveThings(){
        println "Man.helpMoveThings"
    }
}

class Woman {
    void helpMoveThings(){
        println "Woman.helpMoveThings"
    }
}

class Elephant {
    void helpMoveThings(){
        println "Elephant.helpMoveThings"
    }

    void eatSugarcane(){
        println "Elephant.eatSugarcane"
    }
}

takeHelp(new Man())
takeHelp(new Woman())
takeHelp(new Elephant())
//        Man.helpMoveThings
//        Woman.helpMoveThings
//        Elephant.helpMoveThings
//        Elephant.eatSugarcane