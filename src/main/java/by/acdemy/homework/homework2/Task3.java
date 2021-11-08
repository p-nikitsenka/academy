package by.acdemy.homework.homework2;

public class Task3 {
    public static void main(String[] args) {
        String str1 = "Черепаха";
        String str2 = "академия";
        String subStr1 = str1.substring(0, str1.length()/2);
        String subStr2 = str2.substring(str2.length()/2, str2.length());
        StringBuilder sb = new StringBuilder();
        sb.append(subStr1);
        sb.append(subStr2);
        System.out.println(sb);

    }
}
