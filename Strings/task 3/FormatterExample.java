import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        
        // Создаем объект Formatter для вывода в консоль
        Formatter formatter = new Formatter();

        // Пример 1: %b — Логическое значение
        boolean isJavaFun = true;
        formatter.format("Is Java fun? %b%n", isJavaFun);  // %b — форматирует булевое значение
        System.out.println(formatter.toString());

        // Пример 2: %c — Символьное представление
        char grade = 'A';
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Grade: %c%n", grade);  // %c — форматирует символ
        System.out.println(formatter.toString());

        // Пример 3: %d — Десятичное целое значение
        int number = 123;
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Number: %d%n", number);  // %d — форматирует целое число
        System.out.println(formatter.toString());

        // Пример 4: %f — Десятичное значение с плавающей точкой
        double price = 99.99;
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Price: %.2f%n", price);  // %.2f — форматирует число с плавающей точкой (2 знака после запятой)
        System.out.println(formatter.toString());

        // Пример 5: %s — Строковое представление аргумента
        String name = "Java Developer";
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Name: %s%n", name);  // %s — форматирует строку
        System.out.println(formatter.toString());

        // Закрытие ресурса
        formatter.close();
    }
}
