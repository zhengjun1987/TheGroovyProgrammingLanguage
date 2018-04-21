package chapter02

def str = 'null'
if (str) {
    println "The value str is TRUE!"
} else {
    println "The value str is FALSE!"
}

str = ''
if (str) {
    println "The value str is TRUE!"
} else {
    println "The value str is FALSE!"
}

str = null
if (str) {
    println "The value str is TRUE!"
} else {
    println "The value str is FALSE!"
}
//        The value str is TRUE!
//        The value str is FALSE!
//        The value str is FALSE!


def list = null
if (list) {
    println "The value list is TRUE!"
} else {
    println "The value list is FALSE!"
}

list = []
if (list) {
    println "The value list is TRUE!"
} else {
    println "The value list is FALSE!"
}

list = [1]
if (list) {
    println "The value list is TRUE!"
} else {
    println "The value list is FALSE!"
}
//        192:chapter02 zhengjun$ groovy GroovyBoolean
//        The value str is TRUE!
//        The value str is FALSE!
//        The value str is FALSE!
//        The value list is FALSE!
//        The value list is FALSE!
//        The value list is TRUE!

