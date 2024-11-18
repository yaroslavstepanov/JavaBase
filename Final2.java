import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение в формате: [a+b=x, x-a=b и т.д.]:");
        String equation = scanner.nextLine();

        // Проверка корректности ввода
        if (equation.length() != 5 || (equation.charAt(1) != '+' && equation.charAt(1) != '-') || equation.charAt(3) != '=') {
            System.out.println("Неверный формат ввода. Проверьте, что строка соответствует формату a+b=x или x-a=b и т.д.");
            return;
        }

        char operand1 = equation.charAt(0);
        char operator = equation.charAt(1);
        char operand2 = equation.charAt(2);
        char equalsSign = equation.charAt(3);
        char result = equation.charAt(4);

        int x = 0; // Результат для x

        // Обработка случая, когда x находится на первом месте
        if (operand1 == 'x') {
            int b = Character.getNumericValue(operand2);
            int c = Character.getNumericValue(result);

            if (operator == '+') {
                x = c - b;
            } else if (operator == '-') {
                x = c + b;
            }
        }
        // Обработка случая, когда x находится на втором месте
        else if (operand2 == 'x') {
            int a = Character.getNumericValue(operand1);
            int c = Character.getNumericValue(result);

            if (operator == '+') {
                x = c - a;
            } else if (operator == '-') {
                x = a - c;
            }
        }
        // Обработка случая, когда x находится на третьем месте
        else if (result == 'x') {
            int a = Character.getNumericValue(operand1);
            int b = Character.getNumericValue(operand2);

            if (operator == '+') {
                x = a + b;
            } else if (operator == '-') {
                x = a - b;
            }
        } else {
            System.out.println("Ошибка: x должен быть одной из переменных (первой, второй или третьей).");
            return;
        }

        System.out.println("Решение: x = " + x);
        scanner.close();
    }
}
