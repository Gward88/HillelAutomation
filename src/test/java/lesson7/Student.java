package lesson7;

public class Student {
    public  String name;
    public int age;
    public String lastName;
    Student(String name, int age, String lastName){
        this.name = name;
        this.age = age;
        this.lastName = lastName;
    }

    public static void main(String[] args) {
      Student student = new Student("Vasya", 30, "pupkin");
        System.out.println(student.name);
        System.out.println(student.lastName);
        System.out.println(student.age);
    }

}
