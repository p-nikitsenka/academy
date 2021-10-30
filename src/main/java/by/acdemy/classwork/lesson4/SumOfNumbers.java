package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner concsole = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int n = concsole.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Сумма всех чисел от 1 до " + n + " ровна " + sum);
    }
}
