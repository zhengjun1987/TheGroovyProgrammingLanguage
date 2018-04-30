package chapter05

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/4/30 16:31
 *   Project:TheGroovyProgrammingLanguage
 */

langs = ['C++':'Stroustrup','Java':'Gosling','Lisp':'McCathy']
contents = ''
langs.each {
    language,author ->
        fragment = """
<language name="${language}">
    <author>${author}</author>
</language>"""
        contents += fragment
}

xml = "<languages>${contents}\n</languages>"

println(xml)
//        <languages>
//        <language name="C++">
//        <author>Stroustrup</author>
//        </language>
//        <language name="Java">
//        <author>Gosling</author>
//        </language>
//        <language name="Lisp">
//        <author>McCathy</author>
//        </language>
//        </languages>