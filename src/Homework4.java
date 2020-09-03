import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        System.out.println("Введите число: ");
        int array = scanner.nextInt();
        if (array > 0) {
            result = array + 1;
            System.out.println(result);
        } else if (array < 0) {
            result = array - 2;
            System.out.println(result);
        } else {
            result = 10;
            System.out.println(result);
        }

    }
}
