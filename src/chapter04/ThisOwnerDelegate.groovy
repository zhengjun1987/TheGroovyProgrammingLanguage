package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/27 23:11
 *   Project:TheGroovyProgrammingLanguage
 */

static def examinateClosure(closure) {
    closure()
}

println "this = $this"

println "{this.declaredFields} = ${this.declaredFields}"

examinateClosure({
    println "outer it = $it"
    println("In first closure：")
    println("class is ${getClass().name}")    //QueryingClosure$_run_closure1
    println "this = $this"  //QueryingClosure@6a28ffa4
    println "{getClass().superclass.name} = ${getClass().superclass.name}"  //groovy.lang.Closure
    println "owner = $owner"    //QueryingClosure@6a28ffa4
    println "{owner.getClass().superclass.name} = ${owner.getClass().superclass.name}"  //groovy.lang.Script
    println "delegate = $delegate"  //QueryingClosure@6a28ffa4
    println "{delegate.class.superclass.name} = ${delegate.class.superclass.name}"   //groovy.lang.Script

    println("========================================================")

    examinateClosure({
        println "inner it = $it"
        println("In closure within the first closure：")
        println("class is ${getClass().name}")
        println "this = $this"
        println "{getClass().superclass.name} = ${getClass().superclass.name}"
        println "owner = " + owner.toString()
//        println "owner = ${owner}"
        println "{owner.getClass().superclass.name} = ${owner.getClass().superclass.name}"
        println "delegate = " + delegate.toString()
        println "{delegate.class.superclass.name} = ${delegate.class.superclass.name}"
    })
})
//        outer it = null
//        In first closure：
//        class is chapter04.ThisOwnerDelegate$_run_closure1
//        this = chapter04.ThisOwnerDelegate@3fa247d1
//                {getClass().superclass.name} = groovy.lang.Closure
//        owner = chapter04.ThisOwnerDelegate@3fa247d1
//                {owner.getClass().superclass.name} = groovy.lang.Script
//        delegate = chapter04.ThisOwnerDelegate@3fa247d1
//                {delegate.class.superclass.name} = groovy.lang.Script
//        ========================================================
//        inner it = null
//        In closure within the first closure：
//        class is chapter04.ThisOwnerDelegate$_run_closure1$_closure2
//        this = chapter04.ThisOwnerDelegate@3fa247d1
//                {getClass().superclass.name} = groovy.lang.Closure
//        owner = chapter04.ThisOwnerDelegate$_run_closure1@895e367
//                {owner.getClass().superclass.name} = groovy.lang.Closure
//        delegate = chapter04.ThisOwnerDelegate$_run_closure1@895e367
//                {delegate.class.superclass.name} = groovy.lang.Closure