public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!";

        // Проверка, содержит ли строка подстроку "Java"
        if (str.contains("Java")) {
            System.out.println("Строка содержит подстроку 'Java'");
        }

        // Проверка, начинается ли строка с подстроки "I like"
        if (str.startsWith("I like")) {
            System.out.println("Строка начинается с подстроки 'I like'");
        }

        // Проверка, заканчивается ли строка на "!!"
        if (str.endsWith("!!")) {
            System.out.println("Строка заканчивается на '!!'");
        }

        // Если все три условия верны, выводим строку в верхнем регистре
        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!")) {
            System.out.println("Все условия верны: " + str.toUpperCase());
        }

        // Замена всех 'a' на 'o' и вывод подстроки "Jovo"
        String modifiedStr = str.replace('a', 'o');
        System.out.println("Подстрока 'Jovo': " + modifiedStr.substring(7, 11));
    }
}