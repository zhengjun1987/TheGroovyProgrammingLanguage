package chapter05

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 15:33
 *   Project:TheGroovyProgrammingLanguage
 */

def price = 648.71
def company = 'Google'
quote = "Today $company stock closed at $price"
println(quote)
//        Today Google stock closed at 648.71
println "=========================================================="
stocks = [Apple: 663.01, Microsoft: 30.95]
newQuote = "Today ${-> company} stock closed at ${-> price}"
newQuote1 = "Today ${ company} stock closed at ${ price}"
stocks.each {
    key, value ->
        company = key
        price = value
        println(newQuote)
        println newQuote1
}
//        Today Apple stock closed at 663.01
//        Today Microsoft stock closed at 30.95

println "=========================================================="
stocks.each { key, value ->
    company = key
    price = value
    println(quote)
}
//        Today Google stock closed at 648.71
//        Today Google stock closed at 648.71
