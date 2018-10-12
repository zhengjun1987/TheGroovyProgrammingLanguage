package chapter02

/**
 * 可选的形参，设置一个默认值
 * @param x
 * @param base
 * @return
 */
def log(x,base=10){
    Math.log(x)/Math.log(base)
}

println log(1024)//3.0102999566398116
println log(1024,10)//3.0102999566398116
println log(1024,2)//10.0

println Math.log(Math.E)//1.0

/**
 * 末尾的参数是可选的
 * @param name
 * @param details
 * @return
 */
def task(name,String[] details){
    println "$name - $details"
}

task "Call","132-0123-7890"
task "Call","132-0123-7890","176-8182-1398"
task 'Check mailbox'