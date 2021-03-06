/**
 * 去掉类和方法的定义，直接采用脚本的方式编程
 * /

 /*各种循环方式*/
for (i in 0..10) {
    print "$i "
}
println ""
10.times {
    /*如果闭包只有一个参数，在Groovy中可以使用默认名字it来表示*/
    print "$it "
}
println ""
0.upto(10) {
    print "$it "
}
println ""
0.step(10, 1) {
    print "$it "
}
println ""

/*GDK对Java类的再封装*/
print "git --version".execute().text
println "git --version".execute().class.name
print "ls".execute().text

/*安全导航操作符*/

def foo(string) {
    /*在变量名后加？表示判空，精简NullPointerException带来的繁冗*/
    string?.reverse()
}

println(foo("evil"))
println(foo(null))

Integer.metaClass.percentRaise = { amount -> (int) (amount * (1 + delegate / 100.00)) }
println 20.percentRaise(12000)

def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile("summary")
} catch (e) {
    print e
}

println Integer.metaClass.percentRaise
println "======================"

class Car1 {
    def miles = 0
    final year

    Car1(year) {
        this.year = year
    }
}

Car1.class.metaClass.incrementMiles = { milesAdded -> delegate?.miles += milesAdded }
def car2005 = new Car1(2005)

def car = new Car1(2008)
println car.year
println car.getMiles()

car.incrementMiles(500)
println car.miles
car2005.incrementMiles(600)
println "car2005.miles = $car2005.miles"
Car1 car1
println car1?.incrementMiles(400)

//car2005.year = 2001

File.metaClass.readLine = {
    def scanner = new Scanner(new FileInputStream(delegate))
    def line = scanner.nextLine()
    scanner.close()
    line
}

def file = new File("summary.groovy")
println file.readLine()

class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println "Received fragile? $fragile, weight:$weight, location:$location"
    }
}

def robot = new Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.height, $robot.width"
robot.access(50, true, x: 30, y: 20, z: 10)
robot.access(x: 30, y: 20, z: 10, 50, true)
