class Semi {
//    def var = 4
    def var = 4;//此处必须要有分号把变量声明和初始化代码块分隔开来
    {
        println "Semi.<init>"
    }
}

def semi = new Semi()