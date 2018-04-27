package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/27 23:38
 *   Project:TheGroovyProgrammingLanguage
 */

def examine(closure) {
    println "{closure.maximumNumberOfParameters} = ${closure.maximumNumberOfParameters}"
    for (parameter in closure.parameterTypes) {
        println(parameter.name)
    }
    println('--')
}

examine() {}
//        {closure.maximumNumberOfParameters} = 1
//        java.lang.Object
//        --
examine() { it } //默认参数类型Object，动态类型
//        {closure.maximumNumberOfParameters} = 1
//        java.lang.Object
//        --
examine() { -> }    //若希望闭包完全拒绝任何参数，则必须采用此格式 ->前没有任何形式参数
//        {closure.maximumNumberOfParameters} = 0
//        --
examine() { val-> }
//        {closure.maximumNumberOfParameters} = 1
//        java.lang.Object
//        --
examine() { Date val-> }
//        {closure.maximumNumberOfParameters} = 1
//        java.util.Date
//        --
examine() { Date val,val2-> }
//        {closure.maximumNumberOfParameters} = 2
//        java.util.Date
//        java.lang.Object
//        --
examine() { Date val,String val2-> }
//        {closure.maximumNumberOfParameters} = 2
//        java.util.Date
//        java.lang.String
//        --
examine() { String val,String val2-> }  //即使两个或多个参数类型一样，parameterTypes与maximumNumberOfParames数量一致
//        {closure.maximumNumberOfParameters} = 2
//        java.lang.String
//        java.lang.String
//        --