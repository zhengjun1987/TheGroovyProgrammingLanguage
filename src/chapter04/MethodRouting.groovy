/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/28 14:31
 */

class Handler {
    def f1(){
        println "Handler.f1 invoked"
    }
    def f2(){
        println "Handler.f2 invoked"
    }
}
class Example {
    def f1(){
        println "Example.f1 invoked"
    }
    def f2(){
        println "Example.f2 invoked"
    }

    def foo(closure){
        closure.delegate = new Handler()
        closure()
    }
}

def f1(){
    println "Script.f1 invoked"
}

new Example().foo(){
    f1()
    f2()
}
//        Script.f1 invoked
//        Handler.f2 invoked
