import groovy.transform.TypeChecked
import groovy.transform.TypeCheckingMode

@TypeChecked
class Sample {
    def method1(){}

    @TypeChecked(TypeCheckingMode.SKIP)
    def method2(String str){
        println str.shout()
    }
}
String.metaClass.shout = { toUpperCase() }
def sample = new Sample()
sample.method2('Hello')