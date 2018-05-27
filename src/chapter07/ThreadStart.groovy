package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/27 22:03
 *   Project:TheGroovyProgrammingLanguage
 */

def printThreadInfo(msg) {
    def currentThread = Thread.currentThread()
    println "$msg Thread is ${currentThread}. Daemon?${currentThread.isDaemon()}"
}

printThreadInfo("Main")
//        Main Thread is Thread[main,5,main]. Daemon?false

Thread.start {
    printThreadInfo("Started")
    sleep(3000){
        println 'Started interrupted!'
    }
    println 'Started finished!'
}

sleep(1000)

Thread.startDaemon {
    printThreadInfo('Daemon')
    sleep(5000){
        println 'Daemon interrupted!'
    }
    println "Daemon finished!"
}
//        Started Thread is Thread[Thread-1,5,main]. Daemon?false
//        Daemon Thread is Thread[Thread-2,5,main]. Daemon?true
//        Started finished!