/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/26 17:18
 */

def sum(n) {
    total = 0
    for (int i = 0; i <= n; i += 2) {
        total += i
    }
    total
}

println("Sum of even numbers from 1 to 10 is ${sum(10)}")
//        Sum of even numbers from 1 to 10 is 30

def product(n) {
    total = 1
    for (int i = 2; i <= n; i += 2) {
        total *= i
    }
    total
}

println("product of even numbers from 1 to 10 is ${product(10)}")
//        product of even numbers from 1 to 10 is 3840

def square(n) {
    total = []
    for (int i = 2; i <= n; i += 2) {
        total << i**2
    }
    total
}

println("Squares of even numbers from 1 to 10 is ${square(10)}")
//        Squares of even numbers from 1 to 10 is [4, 16, 36, 64, 100]


def pickEven(n, block) {
    for (int i = 2; i <= n; i += 2) {
        block(i)
    }
}

pickEven(10, { print("$it ") })
pickEven(10) { print("${it}_") }
println()
//        2 4 6 8 10 2_4_6_8_10_

int total = 0
pickEven(10) { total += it }
println("Sum of even numbers from 1 to 10 is $total")
int product = 1
pickEven(10) { product *= it }
println("product of even numbers from 1 to 10 is $product")
list = []
pickEven(10) { list << it**2 }
println("Squares of even numbers from 1 to 10 is $list")
//        Sum of even numbers from 1 to 10 is 30
//        product of even numbers from 1 to 10 is 3840
//        Squares of even numbers from 1 to 10 is [4, 16, 36, 64, 100]
