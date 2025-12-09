package work6;

public class Laba6 {
    public static void main(String[] args) {
        // Завдання 3: int -> Octal String
        int number = 511;
        // Використовуємо готовий метод, як зробив ваш колега, щоб зекономити місце
        String octal = Integer.toOctalString(number);
        System.out.println("Завдання 3 (Octal): " + octal);

        // Завдання 10: Замінити слова на VELIKI LITERI
        String text = "The user with the nickname koala757677 this month wrote 3 times more comments than the user with the nickname croco181dile920 4 months ago";
        String result = toUpperCaseText(text);
        System.out.println("Завдання 10: " + result);
    }

    public static String toUpperCaseText(String sentence) {
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");

        for (String word : words) {
            boolean isWord = true;
            // Перевіряємо, чи слово складається ТІЛЬКИ з літер
            for (char c : word.toCharArray()) {
                if (!Character.isLetter(c)) {
                    isWord = false;
                    break;
                }
            }

            // Якщо це чисте слово - піднімаємо регістр, інакше - лишаємо як є
            if (isWord) {
                sb.append(word.toUpperCase());
            } else {
                sb.append(word);
            }
            sb.append(" "); // Додаємо пробіл назад
        }

        return sb.toString().trim();
    }
}
