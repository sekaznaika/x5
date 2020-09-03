import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        int array[] = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = getMax(array);
        int sum = getSum(array);
        int min = getMin(array);
        int count = getCount(array);
        int averageNegativeValue = getAverage(array);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Сумма положительных чисел: " + sum);
        System.out.println("Сумма отрицательных четных чисел: " + min);
        System.out.println("Количество положительных чисел: " + count);
        System.out.println("Среднее арифмитическое отрицательных чисел: " + averageNegativeValue);
    }

    public static int getMax(int[] maxArray) {
        int maxValue = maxArray[0];
        for (int i = 0; i < maxArray.length; i++) {
            if (maxArray[i] > maxValue) {
                maxValue = maxArray[i];
            }
        }
        return maxValue;
    }

    public static int getSum(int[] sumArray) {
        int sumValue = 0;
        for (int i = 0; i < sumArray.length - 1; i++) {
            if (sumArray[i] > 0) {
                sumValue = sumValue + sumArray[i];
            }
        }
        return sumValue;
    }

    public static int getMin(int[] minArray) {
        int minValue = 0;
        for (int i = 0; i < minArray.length; i++) {
            if ((minArray[i] < 0) && (minArray[i] % 2 == 0)) {
                minValue = minValue + minArray[i];
            }
        }
        return minValue;
    }

    public static int getCount(int[] countArray) {
        int countValue = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                countValue += 1;
            }
        }
        return countValue;
    }

    public static int getAverage(int[] averageArray) {
        int negativeValue = 0;
        int countValue = 0;
        int averageNegativeValue = 0;
        for (int i = 0; i < averageArray.length; i++) {
            if (averageArray[i] < 0) {
                negativeValue = negativeValue + averageArray[i];
                countValue += 1;
            }
        }
        averageNegativeValue = negativeValue / countValue;
        return averageNegativeValue;
    }

}