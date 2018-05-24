package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/23 23:14
 *   Project:TheGroovyProgrammingLanguage
 */

def string = 'Hello'
println(string)
//        Hello
println(string.dump())
//        Hello
println(string.toString())
//        <java.lang.String@42628b2 value=Hello hash=69609650>
println "{string.inspect()} = ${string.inspect()}"
//        {string.inspect()} = 'Hello'