package work_2;

public class Main {
    public static void main(String[] args) {
        // ---------- Завдання 25 ----------
        // y = (a^b / ch(|b|)) + 4 * (lg(c) / ⁵√d)
        double a25 = 2.98, b25 = 5.55, c25 = 0.045, d25 = 0.129;
        double y25 = (Math.pow(a25, b25) / Math.cosh(Math.abs(b25)))
                   + 4 * (Math.log10(c25) / Math.pow(d25, 1.0 / 5.0));
        System.out.printf("Завдання 25 (a=%.2f, b=%.2f, c=%.3f, d=%.3f): %.10f%n", a25, b25, c25, d25, y25);


        // ---------- Завдання 26 ----------
        // y = (ᶜ√tg(a)) / (2 - sh(b) / ln|d+c|)
        double a26 = 1.27, b26 = 10.99, c26 = 4, d26 = -25.32;
        double y26 = Math.pow(Math.tan(a26), 1.0 / c26)
                   / (2 - Math.sinh(b26) / Math.log(Math.abs(d26 + c26)));
        System.out.printf("Завдання 26 (a=%.2f, b=%.2f, c=%.0f, d=%.2f): %.10f%n", a26, b26, c26, d26, y26);


        // ---------- Завдання 27 ----------
        // y = sin(a⁻ᵇ) + 3 * |arccos(-c/√d)|
        double a27 = 0.478, b27 = -1.26, c27 = 2.68, d27 = 18.24;
        double y27 = Math.sin(Math.pow(a27, -b27))
                   + 3 * Math.abs(Math.acos(-c27 / Math.sqrt(d27)));
        System.out.printf("Завдання 27 (a=%.3f, b=%.2f, c=%.2f, d=%.2f): %.10f%n", a27, b27, c27, d27, y27);
    }
}
