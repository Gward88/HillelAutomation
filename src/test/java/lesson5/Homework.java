package lesson5;

import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[][] array = new int[2][2];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length; j++) {
                array[i][j] = j+15;
                System.out.println(array[i][j]);

            }
            array[i][0] = i+10;
            System.out.println(array[i][0]);
        }

    }
}
