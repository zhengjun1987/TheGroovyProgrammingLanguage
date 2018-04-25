package chapter03;

import java.math.BigDecimal;

public class Executive extends Employee {
    public void raise(Number amount) {
        System.out.println("Employee.raise  " + "amount = [" + amount + "]");
    }

    public void raise(BigDecimal amount) {
        System.out.println("Employee.raise outlandish " + "amount = [" + amount + "]");
    }
}