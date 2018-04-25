package chapter03

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/25 23:06
 *   Project:TheGroovyProgrammingLanguage
 */

void giveRaise(Employee employee){
    employee.raise(new BigDecimal(10000.00))
}

giveRaise(new Employee())
giveRaise(new Executive())
//        Employee.raise  amount = [10000]
//        Employee.raise outlandish amount = [10000]
//
//        Process finished with exit code 0