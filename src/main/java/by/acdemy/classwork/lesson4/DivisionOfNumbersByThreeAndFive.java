package by.acdemy.classwork.lesson4;

public class DivisionOfNumbersByThreeAndFive {
    public static void main(String[] args) {
        for (int i = 20; i <= 50; i++) {
            if(i % 3 == 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
