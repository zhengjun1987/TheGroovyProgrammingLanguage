package chapter06
/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/5/2 15:32
 */

langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCathy']
println "{langs.getClass().name} = ${langs.getClass().name}"    //{langs.getClass().name} = java.util.LinkedHashMap
println "{langs['Java']} = ${langs['Java']}"        //{langs['Java']} = Gosling
println "{langs['C++']} = ${langs['C++']}"      //{langs['C++']} = Stroustrup
println "{langs.Java} = ${langs.Java}"  //{langs.Java} = Gosling
//println "{langs.C++} = ${langs.C++}"    //Caught: java.lang.NullPointerException: Cannot invoke method next() on null object
println "{ langs.'C++'} = ${langs.'C++'}"   //{ langs.'C++'} = Stroustrup

langs.each {
    println("Language $it.key was authorized by $it.value")
}
//        Language C++ was authorized by Stroustrup
//        Language Java was authorized by Gosling
//        Language Lisp was authorized by McCathy

langs.each { language, author ->
    println("Language $language was authorized by $author")
}
//        Language C++ was authorized by Stroustrup
//        Language Java was authorized by Gosling
//        Language Lisp was authorized by McCathy

println "{ langs.collect { language,author -> language.replaceAll(\"[+]\",\"P\")}} = ${langs.collect { language, author -> language.replaceAll("[+]", "P") }}"
//        { langs.collect { language,author -> language.replaceAll("[+]","P")}} = [CPP, Java, Lisp]

println "{ langs.find { entry -> entry.key.length() > 3 }} = ${langs.find { entry -> entry.key.length() > 3 }}"
//        { langs.find { entry -> entry.key.length() > 3 }} = Java=Gosling

langs.findAll { entry -> entry.key.length() > 3 }.each { key, value -> println("Found $key written by $value ") }
//        Found Java written by Gosling
//        Found Lisp written by McCathy