import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число: "); // не знаю как ограничить тремя знаками
        int array = scanner.nextInt();
        int a = array / 100;
        int b = (array / 10) % 10;
        int c = array % 10;
        System.out.println("Сумма чисел = " + (a + b + c));
    }
}
