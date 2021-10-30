package by.acdemy.homework.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите тип данных: ");
        Scanner console = new Scanner(System.in);
        String type = console.nextLine();
        switch (type) {
            case "int":
                System.out.println("Введите значение переменной типа int");
                if(console.hasNextInt()) {
                    int var1 = console.nextInt();
                    int result1 = var1 % 2;
                    System.out.println("Остаток от деления на 2 переменной " + var1 + " равен " + result1);
                } else {
                    System.out.println("Вы ввели данные неверного типа. Введите данные типа int");
                }
                break;
            case "double":
                System.out.println("Введите значение переменной типа double");
                if(console.hasNextDouble()) {
                    double var2 = console.nextDouble();
                    double result2 = var2 * 0.7;
                    System.out.println("70% от числа " + var2 + " равно " + result2);
                } else{
                    System.out.println("Вы ввели данные неверного типа. Ввести нужно именно double");
                }
                break;
            case "float":
                System.out.println("Введите значение переменной типа float");
                if (console.hasNextFloat()) {
                    System.out.println("Вы ввели данные неверного типа. Введите данные типа float");
                } else {
                    float var3 = console.nextFloat();
                    double result3 = var3 * var3;
                    System.out.println(var3 + " в квадрате равно " + result3);
                }
                break;
            case "String":
                System.out.println("Введите значение переменной типа String");
                    String var4 = console.nextLine();
                    System.out.println("Hello " + var4);
                break;

        }







        }

    }
