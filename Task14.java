import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] array = new int[15];
        Random random = new Random();

        // Заполнение массива случайными значениями от -20 до 20
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 20; // Диапазон от -20 до 20
        }

        // Поиск минимального и максимального значения
        int min = array[0];
        int max = array[0];
        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        // Вывод минимального и максимального значения
        System.out.println("Массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

        // Нахождение наибольшего по модулю значения между минимальным и максимальным
        int maxAbs = Math.abs(min) > Math.abs(max) ? min : max;
        System.out.println("Наибольшее по модулю значение: " + maxAbs);
    }
}