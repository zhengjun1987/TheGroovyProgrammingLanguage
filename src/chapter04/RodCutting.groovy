package chapter04

import groovy.transform.Immutable

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/29 22:44
 *   Project:TheGroovyProgrammingLanguage
 */

def timeIt(length, closure) {
    def start = System.nanoTime()
    println("Max revenue for $length is ${closure(length)}")
    def end = System.nanoTime()
    println("It takes ${(end - start) / 1.0e6} milliseconds")
}

int[] rodPrices = [0, 1, 3, 4, 5, 8, 9, 11, 12, 14, 15, 15, 16, 18, 19, 19, 20, 21, 22, 24, 25, 25, 26, 28, 29, 35, 37, 38, 39, 40]
def desiredLength = 27
println "rodPrices[desiredLength] = ${rodPrices[desiredLength]}"   //38

@Immutable
class RevenueDetails {
    int revenue
    ArrayList<Integer> splits
}

def cutRod

cutRod = { int[] prices, length ->
    if (length == 0)
        return new RevenueDetails(revenue: 0, splits: [])
    else {
        def maxRevenueDetails = new RevenueDetails(Integer.MIN_VALUE, [] as ArrayList<Integer>)
        for (rodSize in 1..length) {
            def revenueFromSecondHalf = cutRod(prices, length - rodSize)
            def potentialRevenue = new RevenueDetails(prices[rodSize] + revenueFromSecondHalf.revenue, revenueFromSecondHalf.splits + rodSize)
            if (potentialRevenue.revenue > maxRevenueDetails.revenue)
                maxRevenueDetails = potentialRevenue
        }
        return maxRevenueDetails
    }
}.memoize()

timeIt(desiredLength) { length -> cutRod(rodPrices, length) }
//        rodPrices[desiredLength] = 38
//        Max revenue for 27 is chapter04.RevenueDetails(43, [5, 5, 5, 5, 5, 2])
//        Disconnected from the target VM, address: '127.0.0.1:57795', transport: 'socket'
//        It takes 245.43805 milliseconds