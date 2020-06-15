package lesson7;

public class Teacher {
    private   String name;
    private int age;
    private String lastName;

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(45);
        teacher.setName("Arkadiy");
        teacher.setLastName("Pupkin");
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getLastName());

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
