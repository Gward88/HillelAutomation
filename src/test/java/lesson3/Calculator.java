package lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        int operation = Integer.parseInt(reader.readLine());
        System.out.println("Ввведите первое число");
        double a = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число");
        double b = Integer.parseInt(reader.readLine());
        double result = 0;
        if (operation == 1){
            result = a + b;
        }
        else if (operation == 2){
            result = a - b;
        }
        else if (operation == 3){
            result = a * b;
        }
        else if (operation == 4){
            result = a / b;
        }
        System.out.println("Результат = " + result);
        reader.close();
    }

}