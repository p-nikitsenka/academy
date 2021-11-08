package by.acdemy.homework.homework2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Please enter the number of words to be entered from the console:");
        int num = console.nextInt();
        int length = Integer.MAX_VALUE;
        String minWord = "";
        for(int i = 0; i < num; i++) {
            System.out.println("Please enter any word");
            String str = console.next();
            if (str.chars().distinct().count() < length) {
                length = (int) (str.chars().distinct().count());
                minWord = str;
            }
        }
        System.out.println("Мнимиальное количество различных символов -- " + length + " -- использовано в слове -- " + minWord);

    }
}
