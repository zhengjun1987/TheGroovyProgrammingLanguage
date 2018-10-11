package chapter02

import groovy.transform.Canonical
import groovy.transform.Immutable

@Canonical(excludes = 'age,lastName')
class Person {
    String firstName
    String lastName
    int age

//    @Override
//    public String toString() {
//        return "Person{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", age=" + age +
//                '}';
//    }
}

def sara = new Person(firstName: 'Sara', lastName: 'Walker', age: 49)
println(sara)
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
 * @author Zheng Jun
 */
class Manager {
    @Delegate
    Expert mExpert = new Expert()
    @Delegate
    Worker mWorker = new Worker()
}

def bernie = new Manager()
bernie.work()
bernie.analyze()
bernie.report()
//        Get work done.
//        Expert analysis...
//        Writing report

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
println(asNeeded.mHeavy1.size)
println(asNeeded.mHeavy1.size)
println(asNeeded.mHeavy2.size)
//        AsNeeded.<init>
//        Creating Heavy with 10
//        10
//        10
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

@Singleton(lazy = true)
class TheUnique {
    static def hello() {
        println("hello")
    }

    def hi() {
        println "Hey!"
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