class Calibrator {
    Calibrator(calculationBlock) {
        print('Using... ')
        calculationBlock()
    }
}
/**
 * 正确调用方法
 */
def calibrator = new Calibrator({
    println 'The calculation provided'
})
//        Using... The calculation provided

/**
 * 本意是调用Calibrator的构造方法
 * Groovy编译器认为此段代码要构造一个匿名内部类
 */
//def calibrator1 = new Calibrator(){
//    println 'The calculation provided'
//}
//        org.codehaus.groovy.control.MultipleCompilationErrorsException: startup failed