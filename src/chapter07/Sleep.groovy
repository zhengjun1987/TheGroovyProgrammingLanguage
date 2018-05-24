package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/24 07:28
 *   Project:TheGroovyProgrammingLanguage
 */

thread = Thread.start {
    println "Thread started"
    def start = System.nanoTime()
    try {
        Thread.sleep(2000)
    } catch (InterruptedException ie) {
        println ie.getMessage()
    }
    def end = System.nanoTime()
    println("Thread done in ${(end-start)/10**9} seconds")
}

new Object().sleep(100)
println("Let's interrupt that thread!")
thread.interrupt()
thread.join()

//使用new Object().sleep(2000)时在其他线程中interrupt无效
//    new Object().sleep(2000)
//        Thread started
//        Let's interrupt that thread!
//        Thread done in 2.003355688 seconds

//使用Thread.sleep(2000)时在其他线程中interrupt立即生效
//    try {
//        Thread.sleep(2000)
//    } catch (InterruptedException ie) {
//        println ie.getMessage()
//    }
//        Thread started
//        Let's interrupt that thread!
//        sleep interrupted
//        Thread done in 0.11002024 seconds