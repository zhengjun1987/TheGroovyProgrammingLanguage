package chapter06

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 20:33
 *   Project:TheGroovyProgrammingLanguage
 */

lst = [1, 3, 4, 1, 8, 9, 2, 6]
println "lst = $lst"
println "{lst.class.name} = ${lst.class.name}"
//        lst = [1, 3, 4, 1, 8, 9, 2, 6]
//        {lst.class.name} = java.util.ArrayList

println "{lst[0]} = ${lst[0]}"      //{lst[0]} = 1
println "{lst[lst.size() - 1]} = ${lst[lst.size() - 1]}"    //{lst[lst.size() - 1]} = 6
println "{lst[-1]} = ${lst[-1]}"    //{lst[-1]} = 6
println "{lst[-2]} = ${lst[-2]}"    //{lst[-2]} = 2
println "{lst[2..5]} = ${lst[2..5]}"
println "{lst[-6..-3]} = ${lst[-6..-3]}"
def integers = lst[2..5]
def dump = integers.dump()
println "{lst[2..5].dump()} = ${ dump}"
println "{dump.class} = ${dump.class}"      //java.lang.String
//        {lst[2..5]} = [4, 1, 8, 9]
//        {lst[-6..-3]} = [4, 1, 8, 9]
//        {lst[2..5].dump()} = <java.util.ArrayList@fedbf elementData=[4, 1, 8, 9] size=4 modCount=1>

integers[0] = 55
println "After integers[0] =55 lst = $lst"
//        After integers[0] =55 lst = [1, 3, 4, 1, 8, 9, 2, 6]

