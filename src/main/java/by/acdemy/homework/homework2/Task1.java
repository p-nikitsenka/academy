package by.acdemy.homework.homework2;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String str1 = console.nextLine();
        System.out.println("Enter string 2: ");
        String str2 = console.nextLine();
        console.close();
        if(str1.length() != str2.length()) {
            System.out.println(false);
            return;
        }
        int[] letters = new int[256];
        char[] str1_array = str1.toCharArray();
        for(char c: str1_array) {
            letters[c]++;
        }
        for(int i = 0; i < str2.length(); i++){
            int c = (int)str2.charAt(i);
            if(--letters[c] < 0){
                System.out.println(false);
                return;
            }
            System.out.println(true);
            return;

        }



    }
}
