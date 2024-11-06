import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ввод чисел
        double num1 = getValidDouble(scanner, "Введите первое число: ");
        double num2 = getValidDouble(scanner, "Введите второе число: ");

        // Выбор действия
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Выбор действия
        switch (operator) {
            case '+':
                System.out.println("Результат: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Результат: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) { //проверка деления на 0
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль невозможно.");
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор.");
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
                System.out.println("Ошибка: введите корректное число!");
                scanner.next();  //тут чистим
            }
        }
        return value;
    }
}
