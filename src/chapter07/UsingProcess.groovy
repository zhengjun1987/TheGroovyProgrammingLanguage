package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/26 23:21
 *   Project:TheGroovyProgrammingLanguage
 */

process = "wc".execute()

process.out.withWriter {
    it << "Let the world know...\n"
    it << "Groovy rocks!\n"
}

println(process.in.text)
//        2       6      36 2行、6个单词、36个字符
