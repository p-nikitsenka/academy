package by.acdemy.classwork.lesson4;

public class NumbersFrom100To200 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 100; i <= 200; i++){
            if(i % 17 == 0){
                sum = sum + i;
            }
        }
        System.out.println("Сумма всех чисел от 100 до 200, кратных 17, равно: " + sum);
    }
}
