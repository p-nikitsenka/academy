package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class NaturalnieChisla {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите любое натуральное число");
        int number = str.nextInt();
        int sum = 0;
        int i;
        for (i = 0; i < number; i++){
            if(i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                sum+=1;
            }
        }
        System.out.println(i);
        System.out.println("Количество натуральных чисел, непревосходящих " + number + ", которые не делятся ни на 2, ни на 3" +
                "ни на 5 равно " + (i - sum));
    }
}
