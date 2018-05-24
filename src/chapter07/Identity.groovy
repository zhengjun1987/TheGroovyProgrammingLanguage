package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/23 23:20
 *   Project:TheGroovyProgrammingLanguage
 */

def integers = [1, 2]
integers << 3
integers << 4

integers.with {
    add(5)
    add(6)
    println(size())//6
    println(contains(4))//true
}

println "integers = $integers"
integers.with {
    println "this = $this"
    println "owner = $owner"
    println "delegate = $delegate"
}
//        integers = [1, 2, 3, 4, 5, 6]
//        this = chapter07.Identity@147a5d08
//        owner = chapter07.Identity@147a5d08
//        delegate = [1, 2, 3, 4, 5, 6]