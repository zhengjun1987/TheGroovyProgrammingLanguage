package chapter10;

public class AJavaClass {
    static {
        System.out.println("static block in Java");
    }

    {
        System.out.println("initiation block in Java");
    }

    public void sayHello(){
        System.out.println("AJavaClass.sayHello");
    }
}