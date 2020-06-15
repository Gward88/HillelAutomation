package lesson8;

public class Human {
    String name;
    int age;
    int height;

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void doEat(){
        System.out.println("мням мням");
    }
    public void walk(){
        System.out.println("топ топ");
    }
}
