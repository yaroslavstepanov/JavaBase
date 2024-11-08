import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос и проверка размера массива
        int size = getValidArraySize(scanner);

        // Создание массива
        double[] array = new double[size];

        // Запрос и проверка ввода элементов массива
        System.out.println("Введите элементы массива типа double:");
        for (int i = 0; i < size; i++) {
            array[i] = getValidDouble(scanner);
        }

        // Вычисление среднего арифметического
        double average = calculateAverage(array);
        System.out.printf("Среднее арифметическое элементов массива: %.2f%n", average);
        // Массив умноженный на среднее арифметическое
        System.out.println("Массив, умноженный на среднее арифметическое:");
        printArrayMultipliedByAverage(array, average);

        scanner.close();
    }

    // Метод для проверки ввода корректного целого положительного числа
    private static int getValidArraySize(Scanner scanner) {
        System.out.print("Введите размер массива: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите целое положительное число!");
            scanner.next(); // Очистка некорректного ввода
        }
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Ошибка: размер массива должен быть положительным числом.");
            System.exit(1);
        }
        return size;
    }

    // Метод для проверки ввода корректного числа double
    private static double getValidDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите корректное число типа double!");
            scanner.next(); // Очистка некорректного ввода
        }
        return scanner.nextDouble();
    }

    // Среднее арифметическое элементов массива
    private static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Метод для вывода массива, где каждый элемент умножен на среднее арифметическое
    private static void printArrayMultipliedByAverage(double[] array, double average) {
        for (double num : array) {
            System.out.printf("%.2f ", num * average);
        }
        System.out.println();
    }
}