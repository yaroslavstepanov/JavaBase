import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос числа у пользователя с проверкой
        System.out.print("Введите любое целое положительное число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число!");
            scanner.next(); // Очистка
        }
        int n = scanner.nextInt();

        // Проверка, что число положительное
        if (n <= 0) {
            System.out.println("Ошибка: введите положительное целое число.");
        } else {
            int sum = 0;

            // Суммирование всех нечетных чисел от 1 до n
            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }

            System.out.println("Сумма всех нечетных чисел от 1 до " + n + " равна: " + sum);
        }

        scanner.close();
    }
}
