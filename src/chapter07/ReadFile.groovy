package chapter07

/**
 *   Author:Zheng Jun
 *   E-mail:zhengjun1987@outlook.com
 *   Date:2018/5/27 22:17
 *   Project:TheGroovyProgrammingLanguage
 */

println new File("output.txt").text
//        岱宗夫如何
//        齐鲁青未了
//        荡胸生层云
//        决眦入归鸟
//        造化钟神秀
//        阴阳割昏晓
//        会当凌绝顶
//        一览众山小

def file = new File('Array.groovy')
file.eachLine {
    line -> println(line)
}
//        package chapter07
//
//        /**
//         *   Author:Zheng Jun
//         *   E-mail:zhengjun1987@outlook.com
//         *   Date:2018/5/26 23:16
//         *   Project:TheGroovyProgrammingLanguage
//         */
//
//        int[] arr = [1,2,3,4,5]
//        println arr[2..4]//[3, 4, 5]


println file.filterLine {line ->
    line =~ /Zheng/
}
//        *   Author:Zheng Jun

new File("output.txt").withWriter {
    target ->
        target << "\n时来天地皆同力"
        target << "\n运去英雄不自由"
}


println new File("output.txt").text
//
//        时来天地皆同力
//        运去英雄不自由