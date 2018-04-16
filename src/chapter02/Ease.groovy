package chapter02

/* 安全导航操作符？减少噪音，节省精力 */
static def foo(str){
    str?.reverse()
}
println foo("evil")
println ()

//    zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy Ease
//    live
//    null
