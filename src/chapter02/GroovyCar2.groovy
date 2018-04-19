package chapter02

class GCar2 {
    final year
    private miles = 0

    GCar2(year) {
        this.year = year
    }

    def getMiles() {
        println "getMiles() called!"
        return miles
    }

    private void setMiles(miles) {
        throw new IllegalAccessException("You are not allowed to change miles.");
    }

    def drive(dist) {
        if (dist > 0)
            miles += dist
    }
}

def car = new GCar2(2012)
println "Year:$car.year"
println "Miles:$car.miles"
println "Setting miles:"
car.drive(12500)
println "Miles:$car.miles"

//        zhengjuns-MacBook-Pro:chapter02 zhengjun$ groovy GroovyCar2
//        Year:2012
//        getMiles() called!
//        Miles:0
//        Setting miles:
//        getMiles() called!
//        Miles:12500

try {
    print 'Can I set the year?'
    car.year = 2018
    println "Year:$car.year"
} catch (Exception e) {
    println e.getMessage()
}

try {
    print 'Can I set the miles?'
    car.miles = 25000
    println "Year:$car.miles"
} catch (Exception e1) {
    println e1.getMessage()
}

try {
    print 'Can I set the miles?'
    car.setMiles(0)
    println "Year:$car.miles"
} catch (Exception e2) {
    println e2.getMessage()
}
//        Can I set the year?Cannot set readonly property: year for class: chapter02.GCar2
//        Can I set the miles?You are not allowed to change miles.
//        Can I set the miles?You are not allowed to change miles.

println car.class.name
//        chapter02.GCar2
println Calendar.instance.toString()
//        java.util.GregorianCalendar
// [
// time=1524148773794,
// areFieldsSet=true,
// areAllFieldsSet=true,
// lenient=true,
// zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],
// firstDayOfWeek=1,
// minimalDaysInFirstWeek=1,
// ERA=1,Y
// EAR=2018,
// MONTH=3,
// WEEK_OF_YEAR=16,
// WEEK_OF_MONTH=3,
// DAY_OF_MONTH=19,
// DAY_OF_YEAR=109,
// DAY_OF_WEEK=5,
// DAY_OF_WEEK_IN_MONTH=3,
// AM_PM=1,
// HOUR=10,
// HOUR_OF_DAY=22,
// MINUTE=39,
// SECOND=33,
// MILLISECOND=794,
// ZONE_OFFSET=28800000,
// DST_OFFSET=0]
