package chapter02

enum CoffeeSize {
    SHORT,SMALL,MEDIUM,LARGE,MUG
}

def orderCoffe(size){
    print "Coffee order received for size $size ："
    switch (size){
        case CoffeeSize.SHORT..CoffeeSize.SMALL:
            println "You are health conscious!"
            break;
        case [CoffeeSize.MEDIUM,CoffeeSize.LARGE]:
            println "You gotta be a programmer!"
            break;
        default:
            println "You should try caffeine IV!"
    }
}

orderCoffe(CoffeeSize.SMALL)
orderCoffe(CoffeeSize.LARGE)
orderCoffe(CoffeeSize.MUG)
//        192:chapter02 zhengjun$ groovy 09-03CoffeSizeTest.groovy
//        Coffee order received for size SMALL ：You are health conscious!
//        Coffee order received for size LARGE ：You gotta be a programmer!
//        Coffee order received for size MUG ：You should try caffeine IV!

print "Available sizes are:"
for (size in CoffeeSize.values())
    print("$size ")
//        Available sizes are:SHORT SMALL MEDIUM LARGE MUG
