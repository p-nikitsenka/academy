package by.acdemy.homework.homework1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите сумму покупки: ");
        int amount = console.nextInt();
        System.out.println("Введите возраст покупателя: ");
        int age = console.nextInt();
        double discount;
        double finalPrice;
        if(amount < 100) {
            discount = 0.05;
            finalPrice = amount * (1 - discount);
            System.out.println("Ваша скидка: " + discount * 100 + "%");
            System.out.println("К оплате: " + finalPrice + " рублей");
        } else if (amount >= 100 && amount < 200) {
            discount = 0.07;
            finalPrice = amount * (1 - discount);
            System.out.println("Ваша скидка: " + (int)(discount * 100) + "%");
            System.out.println("К оплате: " + (float)finalPrice + " рублей");
        } else if (amount >= 200 && amount < 300){
            discount = 0.12;
            if(age >= 18) {
                discount+= 0.04;
            } else {
                discount -=0.03;
            }
            finalPrice = amount * (1 - discount);
            System.out.println("Ваша скидка: " + (int)(discount * 100) + "%");
            System.out.println("К оплате: " + (float)finalPrice + " рублей");
        } else if (amount >= 300 && amount < 400) {
            discount = 0.15;
            finalPrice = amount * (1 - discount);
            System.out.println("Ваша скидка: " + (int) (discount * 100) + "%");
            System.out.println("К оплате: " + (float) finalPrice + " рублей");
        } else if (amount >= 400) {
            discount = 0.20;
            finalPrice = amount * (1 - discount);
            System.out.println("Ваша скидка: " + (int) (discount * 100) + "%");
            System.out.println("К оплате: " + (float) finalPrice + " рублей");
        }

        }

    }

