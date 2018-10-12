enum CoffeSize{SHORT,SMALL,MEDIUM,LARGE,MUG}
/**
 * 注意此处switch语句中case的对象可以是数组ArrayList
 * @param coffeSize
 * @return
 */
def orderCoffe(CoffeSize coffeSize){
    switch (coffeSize){
        case [CoffeSize.SHORT,CoffeSize.SMALL]:
            println "You are health conscious with $coffeSize"
            break
        case CoffeSize.MEDIUM..CoffeSize.LARGE:
            println "You gotta be a programmer!"
            break
        case CoffeSize.MUG:
            println "You should try Caffeine IV"
            break
    }
}
orderCoffe(CoffeSize.SMALL)
orderCoffe(CoffeSize.LARGE)
orderCoffe(CoffeSize.MUG)

println "Available sizes are:"
for (size in CoffeSize.values()){
    print "$size "
}
//    You are health conscious with SMALL
//    You gotta be a programmer!
//            You should try Caffeine IV
//    Available sizes are:
//    SHORT SMALL MEDIUM LARGE MUG
//    Process finished with exit code 0