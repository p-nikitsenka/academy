package by.acdemy.classwork.lesson4;

import java.util.Scanner;

public class Sberkassa {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада: ");
        Scanner console = new Scanner(System.in);
        int s = console.nextInt();
        System.out.println("Введите количество лет: ");
        int n = console.nextInt();
        System.out.println("Введите размер ставки: ");
        double rate = console.nextDouble();
        rate = rate / 100 + 1;
        System.out.println(rate);
        for (int i = 0; i < n; i++){
            rate = rate * rate;
        }
        System.out.println("Через " + n + " лет сумма вклада станет ровна " + (int)(s*rate));

    }
}
