import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int array = scanner.nextInt();
        if (array > 0) {
            int result = array + 1;
            System.out.println(result);
        } else {
            System.out.println(array);
        }
    }
}
