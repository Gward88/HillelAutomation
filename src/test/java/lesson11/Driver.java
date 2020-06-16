package lesson11;

import lesson8.Human;

public class Driver extends Human implements Car {
    public Driver(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public void doEat() {
        System.out.println("sfdsf");
    }

    @Override
    public void walk() {
        System.out.println("sasfa");
    }
    public void drive(){
        System.out.println("dr dr dr");
        System.out.println(BMW);
    }
}
