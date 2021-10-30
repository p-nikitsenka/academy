package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class RostVKlasse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество учеников в классе: ");
        int number = console.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("Введите рост ученика (в см): ");
            int rost = console.nextInt();
            sum += rost;
        }
        System.out.println("Средний рост учеников в классе будет: " + sum / number + " см");
    }
}
