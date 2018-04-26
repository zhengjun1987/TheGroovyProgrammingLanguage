package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/26 22:57
 *   Project:TheGroovyProgrammingLanguage
 */

class Equipment {
    def calculator

    Equipment(calculator) {
        this.calculator = calculator
    }

    def simulate(){
        println "Equipment.simulate"
        calculator()
    }
}

def equipment = new Equipment({ println("Calculator 1") })
def aCalculator = {println('Calculator 2')}
def equipment1 = new Equipment(aCalculator)
def equipment2 = new Equipment(aCalculator)

equipment.simulate()
equipment1.simulate()
equipment2.simulate()
//        192:src zhengjun$ groovy chapter04/Simulate.groovy
//        Equipment.simulate
//        Calculator 1
//        Equipment.simulate
//        Calculator 2
//        Equipment.simulate
//        Calculator 2

