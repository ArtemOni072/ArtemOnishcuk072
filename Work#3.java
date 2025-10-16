package work_3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    // Допоміжний клас для задачі 11, щоб повернути два значення
    public static class Result {
        public final double sum;
        public final int termsUsed;

        public Result(double sum, int termsUsed) {
            this.sum = sum;
            this.termsUsed = termsUsed;
        }
    }

    // ---------- Обчислювальні методи ----------

    // Задача 4: Обчислити суму ряду
    public static double task4(double a, double b, int k) {
        double sum = 0.0;
        for (int i = 1; i <= k; i++) {
            sum += Math.sqrt(a * i * Math.sqrt(b / i));
        }
        return sum;
    }

    // Задача 10: Обчислити значення функції x(t, n)
    public static double task10(double t, int n) {
        double sum = 0.0;
        double factor;
        if (t < 0) {
            factor = t * t; // t²
        } else {
            factor = Math.sqrt(t);
        }
        for (int i = 1; i <= n; i++) {
            sum += factor * i;
        }
        return sum;
    }

    // Задача 11: Обчислити нескінченну суму з точністю eps
    public static Result task11(double eps) {
        double sum = 0.0;
        int i = 1;
        while (true) {
            double term = 1.0 / ((long)i * i); // Використовуємо long для уникнення переповнення i*i
            if (term < eps) {
                break; // Досягнуто точності, виходимо з циклу
            }
            sum += term;
            i++;
        }
        return new Result(sum, i - 1);
    }

    // ---------- Методи для валідації вводу ----------

    public static String validateTask4(double a, double b, int k) {
        if (k < 1 || k > 30) return "k має бути в діапазоні [1, 30].";
        if (a < 0) return "a не може бути від'ємним (через зовнішній корінь).";
        if (b < 0) return "b не може бути від'ємним (через внутрішній корінь).";
        return null; // Немає помилок
    }

    public static String validateTask10(int n) {
        if (n < 1) return "n має бути >= 1.";
        return null; // Немає помилок
    }

    public static String validateTask11(double eps) {
        if (eps <= 0) return "Точність eps має бути > 0.";
        return null; // Немає помилок
    }


    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // --- Задача 4 ---
        System.out.println("=== Задача 4 ===");
        System.out.print("Введіть a (>=0): "); double a = sc.nextDouble();
        System.out.print("Введіть b (>=0): "); double b = sc.nextDouble();
        System.out.print("Введіть k (1-30): "); int k = sc.nextInt();
        String error4 = validateTask4(a, b, k);
        if (error4 != null) {
            System.out.println("Помилка: " + error4);
        } else {
            System.out.printf("Сума ряду S = %.10f%n%n", task4(a, b, k));
        }

        // --- Задача 10 ---
        System.out.println("=== Задача 10 ===");
        System.out.print("Введіть t: "); double t = sc.nextDouble();
        System.out.print("Введіть n (>=1): "); int n = sc.nextInt();
        String error10 = validateTask10(n);
        if (error10 != null) {
            System.out.println("Помилка: " + error10);
        } else {
            System.out.printf("x(t, n) = %.10f%n%n", task10(t, n));
        }

        // --- Задача 11 ---
        System.out.println("=== Задача 11 ===");
        System.out.print("Введіть точність eps (>0): "); double eps = sc.nextDouble();
        String error11 = validateTask11(eps);
        if (error11 != null) {
            System.out.println("Помилка: " + error11);
        } else {
            Result res11 = task11(eps);
            System.out.printf("Сума нескінченного ряду = %.10f%n", res11.sum);
            System.out.printf("Використано доданків: %d%n", res11.termsUsed);
        }

        sc.close();
    }
}
