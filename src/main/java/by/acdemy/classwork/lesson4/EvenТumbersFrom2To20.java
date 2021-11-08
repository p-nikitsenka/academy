package by.acdemy.classwork.lesson4;

public class EvenТumbersFrom2To20 {
    public static void main(String[] args) {
        int number = 0;
        int j = 0;
        for(int i = 2; i <= 20; i++){
            if(i % 2 == 0) {
                j++;
            }
        }
        int[] numbers = new int[j];
        for( int i = 0, x = 2; i < numbers.length; i++, x+=2){

            numbers[i] = x;

        }
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
