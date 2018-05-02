/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/5/2 9:48
 */

lst = ['Programming', 'In', 'Groovy']
count = 0
lst.each {
    count += it.length()
}
println "count = $count"
//        count = 19

println "{lst.collect(){it.length()}.sum()} = ${lst.collect() { it.length() }.sum()}"
//        {lst.collect(){it.length()}.sum()} = 19

println "{lst.sum()} = ${lst.sum()}"
//        {lst.sum()} = ProgrammingInGroovy

println "{lst.inject(0){seed,it -> seed + it.length()}} = ${lst.inject(0) { seed, it -> seed + it.length() }}"
//{lst.inject(0){seed,it -> seed + it.length()}} = 19

println "lst = $lst"
println "{lst.join(' ')} = ${lst.join(' ')}"
//        lst = [Programming, In, Groovy]
//        {lst.join(' ')} = Programming In Groovy

lst[0] = ['Be','Productive']
println "lst = $lst"
lst = lst.flatten()
println "lst = $lst"
//        lst = [[Be, Productive], In, Groovy]
//        lst = [Be, Productive, In, Groovy]

println "{lst*.size()} = ${lst*.size()}"    //{lst*.size()} = [2, 10, 2, 6]