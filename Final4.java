import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";
        String hint = "Это связано с компьютерами и файлами.";

        System.out.println("Загадка: " + riddle);

        boolean usedHint = false;

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Введите ваш ответ (или 'Подсказка'): ");
            String userAnswer = getValidInput(scanner);

            // Обработка запроса на подсказку
            if (userAnswer.equalsIgnoreCase("Подсказка")) {
                if (attempt == 1 && !usedHint) {
                    System.out.println("Подсказка: " + hint);
                    usedHint = true;
                } else {
                    System.out.println("Подсказка уже недоступна.");
                }
                continue;
            }

            // Проверка правильности ответа
            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                return;
            } else {
                if (attempt < 3) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз.");
                }
            }

            // Если использована подсказка
            if (usedHint) {
                System.out.println("Обидно, приходи в другой раз.");
                return;
            }
        }

        scanner.close();
    }

    // Метод для проверки корректности ввода
    private static String getValidInput(Scanner scanner) {
        String input;
        while (true) {
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                break;
            }
            System.out.println("Ошибка: ввод не может быть пустым. Повторите попытку.");
        }
        return input;
    }
}