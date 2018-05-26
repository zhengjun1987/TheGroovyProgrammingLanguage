package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/26 23:08
 *   Project:TheGroovyProgrammingLanguage
 */

class Person {
    def walk(){ println "Walking ..."}
    def walk(miles){ println "Walking $miles miles..."}
    def walk(miles,where){ println "Walking $miles miles $where..."}
}

def john = new Person()
john.walk()
//        Walking ...
john.invokeMethod('walk',null)
//        Walking ...
john.invokeMethod('walk',10)
//        Walking 10 miles...
john.invokeMethod('walk',[10,'uphill'] as Object[])
//        Walking 10 miles uphill...