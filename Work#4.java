import java.util.*;

class Work4 {

    public static void main(String[] args) {

        System.out.println("=== Завдання №9 ===");
        testTask9();

        System.out.println("\n=== Завдання №39 ===");
        testTask39();

        System.out.println("\n=== Завдання №62 ===");
        testTask62();
    }

    // ---------------- ЗАВДАННЯ №9 ----------------
    // Знайти різницю максимального та мінімального елементів масиву
    public static void testTask9() {
        int[][] testArrays = {
                {5, 9, -2, 11, 0},
                {3, 3, 3},
                {}
        };

        for (int[] arr : testArrays) {
            try {
                System.out.println("Масив: " + Arrays.toString(arr));
                System.out.println("Різниця (max - min) = " + differenceMaxMin(arr));
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }

    public static int differenceMaxMin(int[] arr) {
        if (arr == null) throw new NullPointerException("Масив = null");
        if (arr.length == 0) throw new IllegalArgumentException("Порожній масив");

        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return max - min;
    }

    // ---------------- ЗАВДАННЯ №39 ----------------
    // Знайти різницю максимального та передостаннього елементів масиву
    public static void testTask39() {
        int[][] testArrays = {
                {4, 1, 7, 9, 5},
                {10, 20},
                {1}
        };

        for (int[] arr : testArrays) {
            try {
                System.out.println("Масив: " + Arrays.toString(arr));
                System.out.println("Різниця (max - передостанній) = " + differenceMaxAndSecondLast(arr));
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }

    public static int differenceMaxAndSecondLast(int[] arr) {
        if (arr == null) throw new NullPointerException("Масив = null");
        if (arr.length < 2) throw new IndexOutOfBoundsException("Масив занадто короткий (<2)");

        int max = arr[0];
        for (int v : arr) { // цикл for-each
            if (v > max) max = v;
        }

        int secondLast = arr[arr.length - 2];
        return max - secondLast;
    }

    // ---------------- ЗАВДАННЯ №62 ----------------
    // Сформувати новий масив: поділити всі елементи на мінімальний (якщо ≠ 0),
    // інакше замінити всі елементи на -10
    public static void testTask62() {
        int[][] testArrays = {
                {2, 4, 6, 8},
                {0, 3, 0},
                {-5, -10, 0, 5},
                {}
        };

        for (int[] arr : testArrays) {
            try {
                System.out.println("Масив: " + Arrays.toString(arr));
                System.out.println("Новий масив: " + Arrays.toString(transform(arr)));
            } catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        }
    }

    public static int[] transform(int[] arr) {
        if (arr == null) throw new NullPointerException("Масив = null");
        if (arr.length == 0) throw new IllegalArgumentException("Порожній масив");

        int min = arr[0];
        for (int v : arr) if (v < min) min = v;

        int[] result = new int[arr.length];
        if (min != 0) {
            for (int i = 0; i < arr.length; i++) { // цикл for
                result[i] = arr[i] / min;
            }
        } else {
            Arrays.fill(result, -10);
        }
        return result;
    }
}
