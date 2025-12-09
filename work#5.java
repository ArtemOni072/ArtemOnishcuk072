package work5;
import java.util.Arrays;
import java.util.Scanner;

public class Laba5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів у масиві: ");
        int n = scanner.nextInt();

        scanner.nextLine();

        float[] userArray = new float[n];

        System.out.println("Введіть " + n + " чисел (можна дробові, через пробіл):");
        String lineOfNumbers = scanner.nextLine();

        lineOfNumbers = lineOfNumbers.replace(",", ".");

        String[] numberStrings = lineOfNumbers.split(" ");

        for (int i = 0; i < n; i++) {
            if (i < numberStrings.length) {
                userArray[i] = Float.parseFloat(numberStrings[i]);
            } else {
                userArray[i] = 0.0f;
            }
        }

        scanner.close();

        System.out.println("Ваш початковий масив: " + Arrays.toString(userArray));

        float[] arrayForInsertion = Arrays.copyOf(userArray, userArray.length);
        float[] arrayForBubble = Arrays.copyOf(userArray, userArray.length);

        System.out.println("\nРезультат Insertion Sort (сортування вставкою):");
        insertionSort(arrayForInsertion);
        System.out.println(Arrays.toString(arrayForInsertion));

        System.out.println("\nРезультат Bubble Sort (сортування бульбашкою):");
        bubbleSort(arrayForBubble);
        System.out.println(Arrays.toString(arrayForBubble));
    }

    public static void insertionSort(float[] arr) {
        if (arr == null || arr.length < 2) return;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            float key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void bubbleSort(float[] arr) {
        if (arr == null || arr.length < 2) return;
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
