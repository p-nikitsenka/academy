package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class PairsOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите 10 пар чисел: ");
        for(int i = 1; i <= 10; i++){
            System.out.println("Пара " + i);
            int number1 = console.nextInt();
            System.out.println("и");
            int number2 = console.nextInt();
            if (number1 > number2) {
                System.out.println("Большим является число " + number1);
            } else if(number1 < number2) {
                System.out.println("Большим является число " + number2);
            } else {
                System.out.println("Числа равны " + number1 + " и " + number2);
            }

        }
    }
}
