public class Homework10 {
    public static void main(String[] args) {
        int array[] = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0) {
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = tmp;
            }
        }
    }
}

//не получается