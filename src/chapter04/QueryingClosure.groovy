/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 14:46
 */

static def examinateClosure(closure) {
    println "----.examinateClosure"
    closure()
}

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
        println "{owner.getClass().superclass.name} = ${owner.getClass().superclass.name}"
        println "delegate = " + delegate.toString()
        println "{delegate.class.superclass.name} = ${delegate.class.superclass.name}"
    })
})
//        ----.examinateClosure
//        outer it = null
//        In first closure：
//        class is QueryingClosure$_run_closure1
//        this = QueryingClosure@1725dc0f
//                {getClass().superclass.name} = groovy.lang.Closure
//        owner = QueryingClosure@1725dc0f
//                {owner.getClass().superclass.name} = groovy.lang.Script
//        delegate = QueryingClosure@1725dc0f
//                {delegate.class.superclass.name} = groovy.lang.Script
//        ========================================================
//        ----.examinateClosure
//        inner it = null
//        In closure within the first closure：
//        class is QueryingClosure$_run_closure1$_closure2
//        this = QueryingClosure@1725dc0f
//                {getClass().superclass.name} = groovy.lang.Closure
//        owner = QueryingClosure$_run_closure1@31c88ec8
//                {owner.getClass().superclass.name} = groovy.lang.Closure
//        delegate = QueryingClosure$_run_closure1@31c88ec8
//                {delegate.class.superclass.name} = groovy.lang.Closure
//
//        Process finished with exit code 0
