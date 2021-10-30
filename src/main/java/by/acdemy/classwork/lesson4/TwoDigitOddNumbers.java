package by.acdemy.classwork.lesson4;

public class TwoDigitOddNumbers {
    public static void main(String[] args) {
        int mult = 1;
        for(int i = 10; i < 100; i++){
            if(i % 2 != 0 && i % 13 == 0){
                mult = mult * i;
            }
        }
        System.out.println("Произведение всех двузначных нечетных чисел, кратных 13, равно: " + mult);
    }
}
