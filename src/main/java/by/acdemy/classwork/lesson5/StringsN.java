package by.acdemy.classwork.lesson5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringsN {
    public static void main(String[] args) {
        System.out.println("Введите количество строк, которые нужно отобразить");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        int maxlength = 0;
        String minstr = null;
        String maxstr = null;
        int minlength = Integer.MAX_VALUE;

        for (int i = 1; i <= num; i++){
            System.out.println("Введите тест строки № " + i);
            String str = console.next();
            if(str.length() >= maxlength){
                maxlength = str.length();
                maxstr = str;
            }
            if(str.length() <= minlength){
                minlength = str.length();
                minstr = str;
            }
        }
        System.out.println(maxlength);
        System.out.println(maxstr);
        System.out.println(minlength);
        System.out.println(minstr);





           }


    }

