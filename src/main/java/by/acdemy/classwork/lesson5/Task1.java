package by.acdemy.classwork.lesson5;

public class Task1 {
    public static void main(String[] args) {
        String str = "I like Privet!!!";
        char s = str.charAt(str.length() - 1);
        System.out.println(s);
        boolean b = str.endsWith("!!!");
        System.out.println(b);
        boolean c = str.startsWith("I like");
        System.out.println(c);
        boolean d = str.contains("like");
        System.out.println(d);

    }
}
