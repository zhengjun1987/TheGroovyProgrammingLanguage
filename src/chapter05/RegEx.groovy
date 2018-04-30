package chapter05

import java.util.regex.Matcher

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 17:01
 *   Project:TheGroovyProgrammingLanguage
 */

obj = ~"hello"
println "{obj.class.name} = ${obj.class.name}"
//        {obj.class.name} = java.util.regex.Pattern

pattern = ~/(G|g)roovy/
text = 'Groovy is Hip'
println "{text =~ pattern} = ${text =~ pattern}"    //{text =~ pattern} = java.util.regex.Matcher[pattern=(G|g)roovy region=0,14 lastmatch=]

if (text =~ pattern)//部分匹配
    println("YES")
else
    println("NO")
//        YES

if (text ==~ pattern)//精确匹配
    println("YES")
else
    println("NO")
//        NO


def matcher = 'Groovy is groovy' =~ pattern
println "{matcher.size()} = ${matcher.size()}"
println "{matcher[0]} = ${matcher[0]}"
println "{matcher[1]} = ${matcher[1]}"
//        {matcher.size()} = 2
//        {matcher[0]} = [Groovy, G]
//        {matcher[1]} = [groovy, g]

def string = 'Groovy is groovy,really groovy'
println "string = $string"
//        string = Groovy is groovy,really groovy
println "{(string =~ /groovy/).replaceAll('hip')} = ${(string =~ /groovy/).replaceAll('hip')}"
//        {(string =~ /groovy/).replaceAll('hip')} = Groovy is hip,really hip