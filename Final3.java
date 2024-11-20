import java.util.HashSet;
import java.util.Scanner;

public class Final3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества строк
        System.out.print("Введите количество строк: ");
        int n = getValidInt(scanner);
        scanner.nextLine(); // Очистка буфера после ввода числа

        String[] strings = new String[n];

        // Ввод строк
        System.out.println("Введите строки:");
        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Поиск строки с максимальным количеством уникальных символов
        String result = null;
        int maxUniqueCount = 0;

        for (String str : strings) {
            int uniqueCount = countUniqueCharacters(str);
            if (uniqueCount > maxUniqueCount) {
                maxUniqueCount = uniqueCount;
                result = str;
            }
        }

        // Вывод результата
        System.out.println("Ответ: " + result);
    }

    // подсчет уникальных символов в строке
    private static int countUniqueCharacters(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }
        return uniqueChars.size();
    }

    // проверка ввода корректного целого числа
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число!");
            scanner.next(); // Очистка некорректного ввода
        }
        return scanner.nextInt();
    }
}