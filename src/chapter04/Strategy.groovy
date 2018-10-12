package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/26 22:18
 *   Project:TheGroovyProgrammingLanguage
 */

def totalSelectVal(n, clousure) {
    total = 0
    for (i in 1..n) {
        if (clousure(i)) {
            total += i
        }
    }
    total
}

println("Sum of even numbers from 1 to 10 is ${totalSelectVal(10) { it % 2 == 0 }}")
//        Sum of even numbers from 1 to 10 is 30
println("Sum of 3 numbers from 1 to 10 is ${totalSelectVal(10) { it % 3 == 0 }}")
//        Sum of even numbers from 1 to 10 is 18
println("Sum of each numbers from 1 to 10 is ${totalSelectVal(10) { it }}")
//        Sum of even numbers from 1 to 10 is 55
