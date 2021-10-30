package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class NumbersTusk4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество цифр для передачи программе: ");
        int n = console.nextInt();
        int zero = 0;
        int plus = 0;
        int minus = 0;
        for (int i = 0; i < n; i++){
            System.out.println("Введите число: " );
            int number = console.nextInt();
            if (number < 0) {
                minus++;
            }
            if (number == 0) {
                zero++;
            }
            if (number > 0) {
                plus++;
            }
        }
        System.out.println("Количество отрицательных чисел равно: " + minus);
        System.out.println("Количество чисел, равных 0, равно: " + zero);
        System.out.println("Количество положительных чисел равно: " + plus);
    }
}
