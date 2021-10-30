package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class Kosilki {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество косилок: ");
        int number = console.nextInt();
        System.out.println("Введите время работы первой косилки(в часах):");
        int time = console.nextInt();
        int timeInMinutes = time * 60;
        int totalTime = timeInMinutes;
        for(int i = 2; i <= number; i++){
            timeInMinutes+=10;
            totalTime+= timeInMinutes;
        }
        System.out.println("Вся бригада проработала " + totalTime / 60 + " часов и " + totalTime % 60 + " минут");
    }
}
