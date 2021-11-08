package by.acdemy.classwork.lesson4;

public class OddNumbersFrom1to99 {
    public static void main(String[] args) {
        int[] arr = new int[52];
        int count = 0;
        for(int i = 1; i <= 99; i++) {
            if(i % 2 != 0) {
                arr[count++] = i;
            }
            }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);

        }

    }
}
