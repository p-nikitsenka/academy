package by.acdemy.homework.homework1;

public class Task4 {
    public static void main(String[] args) {
        int result = 1;
        int i =0;
        do {
            result *= 2;
            i++;
            System.out.println("2 в степени " + i + " равно " + result);
        } while (result <= 1_000_000);



    }
}
