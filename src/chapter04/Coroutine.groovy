/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 10:55
 */

def iterate(n,closure){
    1.upto(n){
        println("=======================$it=======================")
        closure it
    }
}

println "Calling iterate"
total = 0
iterate(10) {
    total += it
    println "adding to $total"
}
println 'Done!'
//        Calling iterate
//        In iterate with value 1
//        adding to 1
//        In iterate with value 2
//        adding to 3
//        In iterate with value 3
//        adding to 6
//        In iterate with value 4
//        adding to 10
//        Done!