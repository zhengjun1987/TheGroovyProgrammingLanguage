/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/28 15:38
 */

def factorial(BigInteger number) {
    number == 1 ? 1 : number * factorial(number - 1)
}

println "{factorial(5)} = ${factorial(5)}"
try {
    println "{factorial(500).bitCount()} = ${factorial(5000 as BigInteger).bitCount()}"
} catch (Throwable e) {
    println "e.class.name = ${e.class.name}"
}
//        {factorial(5)} = 120
//        e.class.name = java.lang.StackOverflowError