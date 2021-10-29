package by.acdemy.homework.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        int number = console.nextInt();
        int result;
        System.out.println("Таблица умножения для числа: " + number);
        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.print(number + " * " + i + " = ");
            System.out.println(result);

        }
    }
}
