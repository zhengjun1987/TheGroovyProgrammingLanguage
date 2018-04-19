package chapter02

class Robot {
    def type, height, width

    def access(location, weight, fragile) {
        println "Received fragile?$fragile, weight:$weight, loc:$location"
    }
}

def robot = new Robot(type: 'arm', height: 10, width: 40)
println "$robot.type $robot.height $robot.width"

robot.access(x: 30, y: 20, z: 50, 10, true)
robot.access(50, true, x: 20, y: 30, z: 10)
robot.access(true, 40, x: 20, y: 30, z: 10)

//        zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy NamedParameters
//        arm 10 40
//        Received fragile?true, weight:10, loc:[x:30, y:20, z:50]
//        Received fragile?true, weight:50, loc:[x:20, y:30, z:10]
//        Received fragile?40, weight:true, loc:[x:20, y:30, z:10]
