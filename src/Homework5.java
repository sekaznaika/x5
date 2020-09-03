import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.println("Введите три числа: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        int min = 0;
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < array[min]) {
                array[min] = array[i];
            }
        }
        System.out.println("Наименьшое число: " + array[min]);
    }
}
