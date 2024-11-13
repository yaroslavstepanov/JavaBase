import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод пользователем
        System.out.println("Введите строку из слов, разделенных пробелами:");
        String input = scanner.nextLine();

        // Разделение строки на слова
        String[] words = input.split(" ");

        // Для подсчета слов
        int latinWordsCount = 0;

        System.out.println("Слова, состоящие только из латиницы:");
        for (String word : words) {
            // Проверка, состоит ли слово только из латинских букв
            if (word.matches("[A-Za-z]+")) {
                System.out.println(word);
                latinWordsCount++;
            }
        }

        // Вывод количества слов, состоящих только из латиницы
        System.out.println("Количество слов, состоящих только из латиницы: " + latinWordsCount);

        scanner.close();
    }
}