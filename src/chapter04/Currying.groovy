/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/4/27 11:12
 */

def tellFortunes(closure){
    def date = new Date()
    def curry = closure.curry(date)
    curry "Full of Joy"
    curry "Full of Luck"
}

tellFortunes() {
    date,str ->
        println("Fortune for $date is $str")
}
//        Fortune for Fri Apr 27 11:23:48 CST 2018 is Full of Joy
//        Fortune for Fri Apr 27 11:23:48 CST 2018 is Full of Luck