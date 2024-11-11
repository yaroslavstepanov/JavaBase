import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первого числа в строковую переменную
        System.out.print("Введите первое число: ");
        String strNumber = scanner.nextLine();

        // Ввод второго числа в переменную типа int с проверкой
        int intNumber = getValidInt(scanner, "Введите второе число: ");

        // Преобразование строки в число типа double
        double doubleNumber = Double.parseDouble(strNumber);

        // Сравнение чисел и вывод большего
        if (doubleNumber > intNumber) {
            System.out.println("Большее число: " + doubleNumber);
            System.out.println("Меньшее число: " + (double) intNumber);
        } else if (doubleNumber < intNumber) {
            System.out.println("Большее число: " + intNumber);
            System.out.println("Меньшее число: " + doubleNumber);
        } else {
            System.out.println("Числа равны: " + doubleNumber);
        }

        scanner.close();
    }

    // Метод для проверки ввода корректного целого числа
    private static int getValidInt(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число!");
            scanner.next(); // Очистка некорректного ввода
        }
        return scanner.nextInt();
    }
}
