/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/26 11:18
 */

def shoutString(String str){
    println(str.shout())
}

str = 'Hello'
str.metaClass.shout = {-> toString()}

shoutString(str)