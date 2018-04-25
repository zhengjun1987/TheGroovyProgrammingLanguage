package chapter03;

import java.math.BigDecimal;

public class GiveRaiseJava {
    public static void main(String[] args) {
        giveRaise(new Employee());
        giveRaise(new Executive());
    }

    private static void giveRaise(Employee employee) {
        employee.raise(new BigDecimal(10000.00));
    }
}
//        Employee.raise  amount = [10000]
//        Employee.raise  amount = [10000]
//
//        Process finished with exit code 0
