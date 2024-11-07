import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Константы для сравнения
        final int X = 10;
        final int Y = 20;
        final int Z = 30;

        // Ввод размера массива
        System.out.print("Введите размер массива: ");
        int size = getValidInt(scanner);
        int[] array = new int[size];

        // Ввод элементов массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = getValidInt(scanner);
        }

        // Проверка элементов массива на наличие в константах
        boolean found = false;
        for (int num : array) {
            if (num == X || num == Y || num == Z) {
                found = true;
                break;
            }
        }

        //Результат
        if (found) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Совпадений с константами не найдено");
        }

        scanner.close();
    }

    // Проверка на ввод числа
    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введите корректное целое число!");
            scanner.next(); // Очистка
        }
        return scanner.nextInt();
    }
}