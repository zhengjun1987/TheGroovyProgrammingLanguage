package chapter05

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 00:23
 *   Project:TheGroovyProgrammingLanguage
 */

println('He said, "That is groovy"')
//        He said, "That is groovy"

def string = 'A string'
println(string.class.name)  //java.lang.String

value = 25
println('The value is ${value}')
//        The value is ${value}  单引号中间的是纯粹的字符常量，不会计算任何表达式

def Hello = 'Hello'
println(Hello[2])       //l
try {
    Hello[2] = '!' as char
} catch (Throwable throwable) {
    println(throwable.class.name)   //groovy.lang.MissingMethodException
}