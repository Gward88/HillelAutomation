package lesson6;

public class Homework {
    public static void main(String[] args) {
        String s = "sdf;lJKf";
        char[]reverseArray = s.toCharArray();
        for (int i = reverseArray.length-1; i >=0 ; i--) {
            System.out.print(reverseArray[i]);
        }
    }
}
