/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 14:37
 */

def dosomething(closure){
    if (closure){
        closure()
    } else {
        println("Using default implementation...")
    }
}

dosomething()

dosomething(){
    println("Using the special implementation...")
}
//        Using default implementation...
//        Using the special implementation...