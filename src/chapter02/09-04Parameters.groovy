def task (name,String[] details){
    println "$name - $details"
}

task 'Call','135-2427-5852'
task 'Call','135-2427-5852','176-8182-1398'
task 'Check Mail'
//        192:chapter02 zhengjun$ groovy Parameters
//        Call - [135-2427-5852]
//        Call - [135-2427-5852, 176-8182-1398]
//        Check Mail - []