/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/28 16:26
 */

def factorial

factorial = { int number, BigInteger bigInteger -> number == 1 ? bigInteger : factorial.trampoline(number - 1, number * bigInteger) }.trampoline()

println "{factorial(5,1)} = ${factorial(5, 1)}"

println "{factorial(5000,1)} = ${factorial(5000, 1).bitCount()}"
//        {factorial(5,1)} = 120
//        {factorial(5000,1)} = 24654

