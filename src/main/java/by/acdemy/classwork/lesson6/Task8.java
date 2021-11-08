package by.acdemy.classwork.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
//    Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        boolean b = matcher.matches();
        System.out.println(b);

    }
}
