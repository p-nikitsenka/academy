package by.acdemy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
//        Найти все подстроки "Java <X>" и распечатать их.
public class Task10 {
    private static final String str = "Java\\s+\\d+";
            //"Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
    private static final Pattern pattern = Pattern.compile(str);

    public static void main(String[] args) {
        String text ="Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        Matcher m = pattern.matcher(text);
        while (m.find()){
            System.out.println(text.substring(m.start(),m.end()));
        }
    }
}
