def takeHelp(helper){
//    helper.helpMoveThings();
    def strings = ['helpMoveThings','eatSugarcane']
    for (string in strings){
        if (helper.metaClass.respondsTo(helper, string))
            helper."$string"()
    }
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
class Car {
    String eatSugarcane(){
        println "Car1.eatSugarcane"
        3
    }
}
takeHelp(new Car1()) //Caught: groovy.lang.MissingMethodException: No signature of method: Car1.helpMoveThings() is applicable for argument types: () values: []