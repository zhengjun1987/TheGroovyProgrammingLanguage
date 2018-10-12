/**
 * 当类实现了Comparable接口，“==”操作符被重载到compareTo方法
 * is()相当于原来Java里面的==
 */

str1 = 'Hello'
str2 = str1
str3 = new String("Hello")
str4 = "hello"
println "{str1 == str2} = ${str1 == str2}"
println "{str1 == str3} = ${str1 == str3}"
println "{str1 == str4} = ${str1 == str4}"
//        {str1 == str2} = true
//        {str1 == str3} = true
//        {str1 == str4} = false

println "{str1.is(str2)} = ${str1.is(str2)}"
println "{str1.is(str3)} = ${str1.is(str3)}"
println "{str1.is(str4)} = ${str1.is(str4)}"
//        {str1.is(str2)} = true
//        {str1.is(str3)} = false
//        {str1.is(str4)} = false