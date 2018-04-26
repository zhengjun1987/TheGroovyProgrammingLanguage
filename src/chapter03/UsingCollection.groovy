package chapter03

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/25 23:16
 *   Project:TheGroovyProgrammingLanguage
 */

ArrayList<String> strings = new ArrayList<>()
Collection<String> list = strings
strings.add("One")
strings.add("Two")
strings.add("Three")
strings.remove(0)
list.remove(0)

System.out.println("strings = " + strings)
//        strings = [Three]
//        
//        Process finished with exit code 0
