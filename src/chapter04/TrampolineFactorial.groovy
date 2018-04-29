/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/28 16:26
 */

def factorial

factorial = { int number, BigInteger bigInteger -> number == 1 ? bigInteger : factorial.trampoline(number - 1, number * bigInteger) }.trampoline()

println "{factorial(5,1)} = ${factorial(5, 1)}"

//println "{factorial(5000,1).bitCount()} = ${factorial(5000, 1).bitCount()}"
//        {factorial(5,1)} = 120
//        {factorial(5000,1).bitCount()} = 24654

static def test(closure){
    def curry = closure.curry("hello").curry("groovy") //注意此处curry方法返回的是一个新的闭包，而非原来调用curry方法的闭包
    curry "test"
}
//        p1 = hello, p2 = groovy, p3 = test

test() {p1,p2,p3 ->
    println("p1 = $p1, p2 = $p2, p3 = $p3")
}
