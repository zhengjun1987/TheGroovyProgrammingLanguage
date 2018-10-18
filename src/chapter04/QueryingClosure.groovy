package chapter04
/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 14:46
 */

def completeOrder(amount, Closure taxComputer) {
    tax = 0
    println "taxComputer = $taxComputer"
    if (taxComputer.maximumNumberOfParameters == 2) {
        tax = taxComputer(amount, 6.05)
    } else {
        tax = taxComputer.call(amount)
    }
    println("Sales tax is $tax")
}

completeOrder(100) { it * 0.0825 }
completeOrder(100) {
    amount, rate ->
        amount * (rate / 100)
}
//        Sales tax is 8.2500
//        Sales tax is 6.0500