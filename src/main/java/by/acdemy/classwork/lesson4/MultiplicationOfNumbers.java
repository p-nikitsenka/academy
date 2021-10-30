package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class MultiplicationOfNumbers {
    public static void main(String[] args) {
        Scanner concsole = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int n = concsole.nextInt();
        int mult = 1;
        for (int i = 1; i <= n; i++){
            mult = mult * i;
        }
        System.out.println("Произведение всех чисел от 1 до " + n + " равно " + mult);
    }
}
