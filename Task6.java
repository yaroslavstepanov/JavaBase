import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Шаг 1: Выбор типа величины для перевода
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = getValidInt(scanner);

        if (choice == 1) {
            // Шаг 2: Выбор единицы измерения для массы
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - килограмм, 3 - фунт");
            int unitChoice = getValidInt(scanner);

            // Шаг 3: Ввод количества выбранных единиц
            double value = getValidDouble(scanner, "Введите число: ");

            // Конвертация и вывод результатов
            switch (unitChoice) {
                case 1: // Граммы
                    System.out.println("Результат:");
                    System.out.printf("Граммы: %.2f%n", value);
                    System.out.printf("Килограммы: %.2f%n", value / 1000);
                    System.out.printf("Фунты: %.2f%n", value / 453.592);
                    break;
                case 2: // Килограммы
                    System.out.println("Результат:");
                    System.out.printf("Граммы: %.2f%n", value * 1000);
                    System.out.printf("Килограммы: %.2f%n", value);
                    System.out.printf("Фунты: %.2f%n", value * 2.20462);
                    break;
                case 3: // Фунты
                    System.out.println("Результат:");
                    System.out.printf("Граммы: %.2f%n", value * 453.592);
                    System.out.printf("Килограммы: %.2f%n", value / 2.20462);
                    System.out.printf("Фунты: %.2f%n", value);
                    break;
                default:
                    System.out.println("Ошибка: Неверный выбор единицы измерения.");
            }
        } else if (choice == 2) {
            // Шаг 2: Выбор единицы измерения для расстояния
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unitChoice = getValidInt(scanner);

            // Шаг 3: Ввод количества выбранных единиц
            double value = getValidDouble(scanner, "Введите число: ");

            // Конвертация и вывод результатов
            switch (unitChoice) {
                case 1: // Метры
                    System.out.println("Результат:");
                    System.out.printf("Метры: %.2f%n", value);
                    System.out.printf("Мили: %.6f%n", value / 1609.34);
                    System.out.printf("Ярды: %.2f%n", value * 1.09361);
                    System.out.printf("Футы: %.2f%n", value * 3.28084);
                    break;
                case 2: // Мили
                    System.out.println("Результат:");
                    System.out.printf("Метры: %.2f%n", value * 1609.34);
                    System.out.printf("Мили: %.2f%n", value);
                    System.out.printf("Ярды: %.2f%n", value * 1760);
                    System.out.printf("Футы: %.2f%n", value * 5280);
                    break;
                case 3: // Ярды
                    System.out.println("Результат:");
                    System.out.printf("Метры: %.2f%n", value / 1.09361);
                    System.out.printf("Мили: %.6f%n", value / 1760);
                    System.out.printf("Ярды: %.2f%n", value);
                    System.out.printf("Футы: %.2f%n", value * 3);
                    break;
                case 4: // Футы
                    System.out.println("Результат:");
                    System.out.printf("Метры: %.2f%n", value / 3.28084);
                    System.out.printf("Мили: %.6f%n", value / 5280);
                    System.out.printf("Ярды: %.2f%n", value / 3);
                    System.out.printf("Футы: %.2f%n", value);
                    break;
                default:
                    System.out.println("Ошибка: Неверный выбор единицы измерения.");
            }
        } else {
            System.out.println("Ошибка: Неверный выбор типа величины.");
        }

        scanner.close();
    }

    // Метод для проверки ввода целого числа
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число!");
            scanner.next(); // Очистка некорректного ввода
        }
        return scanner.nextInt();
    }

    // Метод для проверки ввода числа с плавающей точкой
    private static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка: введите корректное число!");
                scanner.next(); // Очистка некорректного ввода
            }
        }
        return value;
    }
}