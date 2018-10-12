import groovy.transform.TypeChecked

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/26 10:32
 */

//@TypeChecked
def shout(String str){
    println "Printing in uppercase:"
    println str.toUpperCase()
    println "Printing again in uppercase:"
    println str.toUppercase()   //groovy.lang.MissingMethodException: No signature of method: java.lang.String.toUppercase() is applicable for argument types: () values: []
    // [Static type checking] - Cannot find matching method java.lang.String#toUppercase(). Please check if the declared type is correct and if the method exists.
}

try {
    shout('hello')
} catch (e) {
    e.printStackTrace()
    println 'Failed...'
}
//        Printing in uppercase:
//        HELLO
//        Printing again in uppercase:
//        Failed...
//
//        Process finished with exit code 0