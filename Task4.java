import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод трёх чисел с клавиатуры с проверкой на "дурака" - Первое задание
        double x = getValidDouble(scanner, "Введите число x: ");
        double y = getValidDouble(scanner, "Введите число y: ");
        double z = getValidDouble(scanner, "Введите число z: ");

        // Второе - среднее арифметическое
        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);

        // Третье задание
        int result = (int) (average / 2);
        System.out.println("Результат после деления и округления: " + result);

        // Четвертое задание
        if (result > 3) {
            System.out.println("Программа выполнена корректно");
        }

        scanner.close();
    }

    // Проверка для первого задания
    private static double getValidDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {  // Тут проверка на число
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Ошибка: Введите корректное число!");
                scanner.next(); //тут чистим
            }
        }
        return value;
    }
}
