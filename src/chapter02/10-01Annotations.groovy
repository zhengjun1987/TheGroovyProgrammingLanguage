package chapter02

import groovy.transform.Canonical
import groovy.transform.Immutable

/**
 * Canonical注解的两个方法：includes和excludes 接受参数类型String[]
 */
@Canonical(includes = ['age', 'lastName'])
class Person {
    String firstName
    String lastName
    int age

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }

    Person(Map<String, Object> map) {
        this.firstName = (String) map.get("firstName")
        this.lastName = (String) map.get("lastName")
        this.age = (int) map.get("age")
    }

//    @Override
//    public String toString() {
//         "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                '}'
//    }
}

def sara = new Person(firstName: 'Sara', lastName: 'Walker', age: 49)
//println sara
//未使用注解前的打印结果
//      Person@5e316c74
//使用注解后的打印结果
//      Person(Sara)

class Worker {
    def work() {
        println('Get work done.')
    }

    def analyze() {
        println('Analyze...')
    }

    def report() {
        println('Writing report')
    }
}

class Expert {
    def analyze() {
        println('Expert analysis...')
    }
}

/**
 * 注意@Delegate注释的两个成员变量的先后顺序
 * Delegate作用于成员变量
 */
class Manager {
    /**
     * 编译时查找analysis方法的顺序由上至下，找到之后就返回，所以包含统一方法的两个delegate对象在前面的优先适用
     */
    @Delegate
    Worker mWorker = new Worker()
    @Delegate
    Expert mExpert = new Expert()
}

def bernie = new Manager()
bernie.work()
bernie.analyze()
bernie.report()
//        Get work done.
//        Expert analysis...
//        Writing report

/**
 * 不可变对象天生是线程安全的
 * Immutable作用于类,可以轻松创建不可变对象
 */
@Immutable
class CreditCard {
    String cardNum
    int creditLimit
}

def creditCard = new CreditCard('6552-1658-2222-3333', 45500)
//creditCard.creditLimit = 85000  ReadOnlyPropertyException: Cannot set readonly property: creditLimit for class: CreditCard
println(creditCard)

//        CreditCard(6552-1658-2222-3333, 45500)

class Heavy {
    def size = 10

    Heavy() {
        println("Creating Heavy with $size")
    }
}

/**
 * Lazy注释 可以推迟 非静态成员变量的创建 到第一次访问时
 */
class AsNeeded {
    def value
    @Lazy
    Heavy mHeavy1 = new Heavy()
    @Lazy
    Heavy mHeavy2 = { new Heavy(size: value) }()

    AsNeeded() {
        println "AsNeeded.<init>"
    }
}

def asNeeded = new AsNeeded(value: 1000)
println "==============111=================="
println(asNeeded.mHeavy1.size)
println "==============113=================="
println(asNeeded.mHeavy1.size)
println "==============115=================="
println(asNeeded.mHeavy2.size)
//        AsNeeded.<init>
//        ==============111==================
//        Creating Heavy with 10
//        10
//        ==============113==================
//        10
//        ==============115==================
//        Creating Heavy with 10
//        1000

@Newify([Person, CreditCard])
def fluentCreate() {
    println(Person.new(firstName: "John", lastName: "Done", age: 20))
    println(Person(firstName: "John", lastName: "Done", age: 20))
    println(CreditCard("1234-5678-9012-3456", 20000))
}

fluentCreate()
//        Person(John)
//        Person(John)
//        CreditCard(1234-5678-9012-3456, 20000)
@Newify([Person])
def person = Person("Johnny", "Walker", 90)
println person

@Singleton(lazy = true)
class TheUnique {
    static def hello() {
        println("hello")
    }

    def hi() {
        println "Hi!"
    }
}

println("Access TheUnique")
TheUnique.instance.hello()
TheUnique.instance.hello()
//        Access TheUnique
//        Instance created
//        hello
//        hello

TheUnique.hello()
TheUnique.instance.hi()