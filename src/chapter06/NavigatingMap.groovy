package chapter06

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/3 22:15
 *   Project:TheGroovyProgrammingLanguage
 */

langs = ['C++': 'Stroustrup', 'Java': 'Gosling', 'Lisp': 'McCathy']

print("Does any language name has a nonalphabetic character?")
println(langs.any { language, author -> language =~ "[^A-Za-z]" })
//        Does any language name has a nonalphabetic character? true

print("Does any language author has a nonalphabetic character?")
println(langs.any { language, author -> author =~ "[^A-Za-z]" })
//        Does any language author has a nonalphabetic character? false

friends = [briang: 'Brixan Goetz', brians: 'Brian Sletten', davidb: 'David Bock', davidg: 'David Geary',
           scottd: 'Scott Davis', scottl: 'Scott Lebelknight', stuarth: 'Stuart Halloway']
def groupBy = friends.groupBy { it.value.split(' ')[0] }
println "groupBy = $groupBy"
//        groupBy = [Brixan:[briang:Brixan Goetz], Brian:[brians:Brian Sletten], David:[davidb:David Bock, davidg:David Geary], Scott:[scottd:Scott Davis, scottl:Scott Lebelknight], Stuart:[stuarth:Stuart Halloway]]
groupBy.each { firstName, buddies -> println("$firstName : ${buddies.collect { key, fullName -> fullName }.join(', ')}") }
//        Brian : Brian Goetz, Brian Sletten
//        David : David Bock, David Geary
//        Scott : Scott Davis, Scott Lebelknight
//        Stuart : Stuart Halloway