import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы с проверкой
        int rows = getValidInt(scanner, "Введите количество строк матрицы: ");
        int cols = getValidInt(scanner, "Введите количество столбцов матрицы: ");

        // Создание матрицы
        double[][] matrix = new double[rows][cols];

        // Ввод элементов матрицы
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = getValidDouble(scanner);
            }
        }

        // Вывод первой строки матрицы, где каждый элемент умножен на 3
        System.out.println("Первая строка матрицы, умноженная на 3:");
        for (int j = 0; j < cols; j++) {
            System.out.printf("%.2f ", matrix[0][j] * 3);
        }

        scanner.close();
    }


    private static int getValidInt(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое положительное число!");
            scanner.next(); // Очистка
        }
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Ошибка: значение должно быть положительным числом.");
            System.exit(1);
        }
        return value;
    }

    // Метод для проверки ввода корректного double
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите корректное число типа double!");
            scanner.next(); // Очистка
        }
        return scanner.nextDouble();
    }
}
