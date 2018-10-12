import groovy.transform.TypeChecked

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/26 11:18
 */

/**
 * 添加@TypeChecked开启静态类型检查会导致
 * [Static type checking] - Cannot find matching method java.lang.String#shout(). Please check if the declared type is correct and if the method exists.
 *
 * @param str
 * @return
 */
//@TypeChecked
def shoutString(String str){
    println str.shout()
}

str = 'Hello'
str.metaClass.shout = {-> toUpperCase()}
shoutString(str)