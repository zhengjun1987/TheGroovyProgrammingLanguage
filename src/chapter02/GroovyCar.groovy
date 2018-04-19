package chapter02

class GCar {
    def miles = 0
    final year

    GCar(year) {
        this.year = year
    }
}

def car = new GCar(2008)
println "Year:$car.getYear()"
println "Miles:$car.getMiles()"
println "Setting miles:"
car.miles = 2500
println "Miles:$car.getMiles()"
//        zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy GroovyCar
//        Year:2008
//        Miles:0
//        Setting miles:
//        Miles:2500

