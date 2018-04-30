package chapter05

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 15:33
 *   Project:TheGroovyProgrammingLanguage
 */

price = 648.71
company = 'Google'
quote = "Today $company stock closed at $price"
println(quote)
//        Today Google stock closed at 648.71
stocks = [Apple: 663.01, Microsoft: 30.95]

newQuote = "Today ${-> company} stock closed at ${-> price}"
stocks.each {
    key, value ->
        company = key
        price = value
        println(newQuote)
}
//        Today Apple stock closed at 663.01
//        Today Microsoft stock closed at 30.95

stocks.each { key, value ->
    company = key
    price = value
    println(quote)
}
//        Today Google stock closed at 648.71
//        Today Google stock closed at 648.71
