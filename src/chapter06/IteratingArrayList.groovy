package chapter06

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 22:03
 *   Project:TheGroovyProgrammingLanguage
 */

lst = [1, 3, 4, 1, 8, 9, 2, 6]
lst.each {
    print("$it ")
}
println()
//        1 3 4 1 8 9 2 6

lst.reverseEach {
    print("$it ")
}
println()
//        6 2 9 8 1 4 3 1

def collect = lst.collect() {
    it * 2
}
println "lst = $lst"
println "collect = $collect"
//        lst = [1, 3, 4, 1, 8, 9, 2, 6]
//        collect = [2, 6, 8, 2, 16, 18, 4, 12]