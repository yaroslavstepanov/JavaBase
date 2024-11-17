import java.util.Scanner;

public class Final1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получение текущего курса доллара
        double exchangeRate = getValidDouble(scanner, "Введите текущий курс доллара: ");

        // Получение количества рублей для конвертации
        double rubles = getValidDouble(scanner, "Введите количество рублей: ");

        // Конвертация рублей в доллары
        double dollars = rubles / exchangeRate;
        
        System.out.printf("Сумма в долларах: %.2f%n", dollars);

        scanner.close();
    }

    // Метод проверки ввода
    private static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                if (value > 0) { // Проверка на положительное значение
                    return value;
                } else {
                    System.out.println("Значение должно быть положительным. Попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка ввода. Введите число.");
                scanner.next(); // Очистка
            }
        }
    }
}