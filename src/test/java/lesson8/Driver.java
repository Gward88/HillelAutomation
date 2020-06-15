package lesson8;

public class Driver extends Human{
    public Driver(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public void doEat() {
        super.doEat();
    }

    @Override
    public void walk() {
        super.walk();
    }
    public void drive(){
        System.out.println("dr dr dr");
    }
}
