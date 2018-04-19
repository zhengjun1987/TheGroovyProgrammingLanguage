package chapter02;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/4/18 21:10
 * Project:TheGroovyProgrammingLanguage
 */
public class Car {
    private int miles;
    private final int year;

    Car(int year) {
        this.year = year;
    }

    void setMiles(int miles) {
        this.miles = miles;
    }

    int getMiles() {
        return miles;
    }

    int getYear() {
        return year;
    }

    public static void main(String[] args) {
        Car car = new Car(2008);
        System.out.println("car.getYear() = " + car.getYear());
        System.out.println("car.getMiles() = " + car.getMiles());
        System.out.println("Setting miles:");
        car.setMiles(2500);
        System.out.println("car.getMiles() = " + car.getMiles());
    }
}
//        car.getYear() = 2008
//        car.getMiles() = 0
//        Setting miles:
//        car.getMiles() = 2500

