package chapter05

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 00:34
 *   Project:TheGroovyProgrammingLanguage
 */

value = 12
println("He paid \$$value for that.")    //$在此处并需要转义字符\
//        He paid $12 for that.

println(/He paid $$value for that./)    //$在此处并不需要转义字符\，但是不能没有圆括号
//        He paid $12 for that.

what = new StringBuilder('fence')
text = "The cow jumped over the $what"
println(text)
what.replace(0,what.length(),"moon")
println(text)
//        The cow jumped over the fence
//        The cow jumped over the moon

//        使用单引号创建的字符串只是单纯的java.lang.String,而使用双引号创建的有些特殊性，GString

def printClassInfo(obj){
    println "{obj.class.name} = ${obj.class.name}"
    println "{obj.class.superclass.name} = ${obj.class.superclass.name}"
}
val = 125
printClassInfo("The stock closed at ${val}")
//        {obj.class.name} = org.codehaus.groovy.runtime.GStringImpl
//        {obj.class.superclass.name} = groovy.lang.GString
printClassInfo(/The stock closed at ${val}/)
//        {obj.class.name} = org.codehaus.groovy.runtime.GStringImpl
//        {obj.class.superclass.name} = groovy.lang.GString
printClassInfo("The ordinary string")
//        {obj.class.name} = java.lang.String
//        {obj.class.superclass.name} = java.lang.Object
printClassInfo('The java string')
//        {obj.class.name} = java.lang.String
//        {obj.class.superclass.name} = java.lang.Object