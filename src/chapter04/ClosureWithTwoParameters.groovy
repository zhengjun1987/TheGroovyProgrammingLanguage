package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/26 23:23
 *   Project:TheGroovyProgrammingLanguage
 */

def tellFortune(closure) {
    closure new Date(102, 0, 27), "Your day is filled with joy"
}

tellFortune() {
    Date date, fortune ->
        println("Fortune for $date is $fortune")
}
//        Fortune for Sun Jan 27 00:00:00 CST 2002 is Your day is filled with joy

tellFortune() {
    date, fortune ->
        println("Fortune for $date is $fortune")
}
//        192:src zhengjun$ groovy chapter04/ClosureWithTwoParameters.groovy
//        Fortune for Sun Jan 27 00:00:00 CST 2002 is Your day is filled with joy