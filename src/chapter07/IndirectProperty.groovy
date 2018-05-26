package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/26 22:42
 *   Project:TheGroovyProgrammingLanguage
 */

class Car {
    int miles,fuelLevel
}

car = new Car(fuelLevel: 80,miles: 25)
properties = ['miles','fuelLevel']

properties.each {
    name ->
        println("$name = ${car[name]}")
}

car[properties[1]]=100
println "fuelLevel now is ${car['fuelLevel']}"
//        miles = 25
//        fuelLevel = 80
//        fuelLevel now is 100

println "fuelLevel now is ${car.fuelLevel}"