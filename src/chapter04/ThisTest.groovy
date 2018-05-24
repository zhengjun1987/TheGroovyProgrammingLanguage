
package chapter04
/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/23 22:42
 *   Project:TheGroovyProgrammingLanguage
 */

def test(closure){
    closure()
}

println "this = $this"//chapter04.ThisTest@4b5d6a01
println "{getClass().name} = ${getClass().name}"
//        this = chapter04.ThisTest@17503f6b
//        {getClass().name} = chapter04.ThisTest
test {
    println "this = $this"//chapter04.ThisTest@4b5d6a01
    println "{getClass().name} = ${getClass().name}"
    println "owner = $owner"//chapter04.ThisTest@4b5d6a01
    println "{owner.getClass().name} = ${owner.getClass().name}"
    println "delegate = $delegate"//chapter04.ThisTest@4b5d6a01
    println "{delegate.class.name} = ${delegate.class.name}"
//        this = chapter04.ThisTest@17503f6b
//        {getClass().name} = chapter04.ThisTest$_run_closure1
//        owner = chapter04.ThisTest@17503f6b
//        {owner.getClass().name} = chapter04.ThisTest
//        delegate = chapter04.ThisTest@17503f6b
//        {delegate.class.name} = chapter04.ThisTest

    test {
        println "this = $this"
        println "{getClass().name} = ${getClass().name}"
        println "owner = ${owner.toString()}"
        println "{owner.getClass().name} = ${owner.getClass().name}"
        println "delegate = ${delegate.toString()}"
        println "{delegate.class.name} = ${delegate.class.name}"
    }
//        this = chapter04.ThisTest@17503f6b
//        {getClass().name} = chapter04.ThisTest$_run_closure1$_closure2
//        owner = chapter04.ThisTest$_run_closure1@2cb2fc20
//        {owner.getClass().name} = chapter04.ThisTest$_run_closure1
//        delegate = chapter04.ThisTest$_run_closure1@2cb2fc20
//        {delegate.class.name} = chapter04.ThisTest$_run_closure1
}
