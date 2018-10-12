enum Methodologies {
    Evo(5),
    XP(21),
    Scrum(30)
    ;
    final int daysInIteration;

    Methodologies(int daysInIteration) {
        this.daysInIteration = daysInIteration
    }

    def iterationDetails(){
        println "$this recommand $daysInIteration days for iteration"
    }
}

for (item in Methodologies.values())
    item.iterationDetails()
//        192:chapter02 zhengjun$ groovy 09-03AgileMethodologies.groovy
//        Evo recommand 5 days for iteration
//        XP recommand 21 days for iteration
//        Scrum recommand 30 days for iteration
