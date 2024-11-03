public class Task3 {
    public static void main(String[] args) {
        // Задание 1
        int [] numbers = {1,2,3,4,5};

        // Задание 2
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length-1];
        numbers[numbers.length-1] = temp;

        // Задание 3
        int sum = numbers[0]+numbers[numbers.length/2];
        System.out.println("Сумма равна " + sum);
    }
}
