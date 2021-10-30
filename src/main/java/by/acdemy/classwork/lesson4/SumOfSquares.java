package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        int number = console.nextInt();
        int sqr = 1;
        int sum = 0;
        for(int i =1; i <= number; i++){
            sqr = i*i;
            sum = sum + sqr;
        }
        System.out.println("Сумма квадратов чисел от 1 до " + number+ " ровна " + sum);
    }
}
