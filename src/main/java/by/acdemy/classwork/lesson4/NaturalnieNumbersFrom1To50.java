package by.acdemy.classwork.lesson4;

public class NaturalnieNumbersFrom1To50 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 50; i++){
            if(i % 5 == 0 || i % 7 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Сумма чисел, делящихся на 5 или 7 ровна: " + sum);
    }
}
