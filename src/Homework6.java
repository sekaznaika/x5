import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0 && value % 2 == 0) {
            System.out.println("Положительное четное число " + value);
        } else if (value > 0 && value % 2 != 0) {
            System.out.println("Положительное нечетное число " + value);
        } else if (value < 0 && value % 2 == 0) {
            System.out.println("Отрицательное четное число " + value);
        } else if (value < 0 && value % 2 != 0) {
            System.out.println("Отрицательное нечетное число " + value);
        } else {
            System.out.println("Введен ноль");
        }
    }
}