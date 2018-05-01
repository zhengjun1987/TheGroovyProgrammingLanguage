package chapter06

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/1 20:03
 *   Project:TheGroovyProgrammingLanguage
 */

lst = [1, 3, 4, 1, 2, 8, 9, 2, 6]
println "{lst.find(){ it == 9 }} = ${lst.find() { it == 9 }}"   //{lst.find(){ it == 9 }} = 9
println "{lst.find(){ it == 2 }} = ${lst.find() { it == 2 }}"   //{lst.find(){ it == 2 }} = 2
// find(closure)方法返回值说明：Finds the first value matching the closure condition.

println "{lst.findAll() { it == 2 }} = ${lst.findAll() { it == 2 }}"    //{lst.findAll() { it == 2 }} = [2, 2]
println "{lst.findAll() { it > 4 }} = ${lst.findAll() { it > 4 }}"      //{lst.findAll() { it > 4 }} = [8, 9, 6]
