import java.text.DecimalFormat;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите код одного из городов(Москва(905) / Ростов(194) / Краснодар(491) / Киров(800): ");
        int value = scanner.nextInt();
        if (value == 905) {
            double cost = 4.15 * 10;
            String formattedDouble = new DecimalFormat("#0.00").format(cost);
            System.out.println("Москва. Стоимость разговора: " + formattedDouble);
        } else if (value == 194) {
            double cost = 1.98 * 10;
            System.out.println("Ростов. Стоимость разговора: " + cost);
        } else if (value == 491) {
            double cost = 2.69 * 10;
            System.out.println("Краснодар. Стоимость разговора: " + cost);
        } else if (value == 800) {
            double cost = 5 * 10;
            System.out.println("Киров. Стоимость разговора: " + cost);
        } else {
            System.out.println("Введен неизвестный код города");
        }
    }
}
