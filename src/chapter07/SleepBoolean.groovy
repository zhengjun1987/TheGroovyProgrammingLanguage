package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/26 22:33
 *   Project:TheGroovyProgrammingLanguage
 */

def testSleep(flag){
    println("Thread started...")
    thread = new Thread().start(){
        def start = System.nanoTime()
        new Object().sleep(2000) {
            println(it.dump())
            flag
        }
        def end = System.nanoTime()
        println "Thread done in ${(end-start)/10**9} seconds"
    }
    thread.interrupt()
    thread.join()
    println ""
}

testSleep(true)
testSleep(false)
//        Thread started...
//        <java.lang.InterruptedException@7546df8c detailMessage=sleep interrupted cause=java.lang.InterruptedException: sleep interrupted stackTrace=[] suppressedExceptions=[]>
//                Thread done in 0.036698312 seconds
//
//        Thread started...
//        <java.lang.InterruptedException@353f1d12 detailMessage=sleep interrupted cause=java.lang.InterruptedException: sleep interrupted stackTrace=[] suppressedExceptions=[]>
//                Thread done in 2.004428048 seconds