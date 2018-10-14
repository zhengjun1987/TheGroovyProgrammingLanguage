package chapter04

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/10/13 20:42
 *   Project:TheGroovyProgrammingLanguage
 */

Writer.metaClass.withWriter2 = {
    Closure closure ->
        closure.call(delegate)
        delegate.close()
}

new FileWriter("output2.txt").withWriter2 {
    it.write(new File(".").absolutePath)
    it.write "\n"
    it.write "\n"
    it.write("ls".execute().text)
}