import java.util.ArrayList; // Импортируем класс ArrayList для работы со списками

public class Main { // Основной класс программы
    public static void main(String[] args) { // Точка входа в программу

        // Примеры примитивных типов данных и их начальные значения
        byte b = 0; // Целое число, занимает 1 байт
        short s = 0; // Целое число, занимает 2 байта
        int i = 0; // Целое число, стандартный тип, занимает 4 байта
        long l = 0L; // Целое число, занимает 8 байт

        // Вывод значений примитивных типов
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);

        // Примеры чисел с плавающей запятой
        float f = 0.0f; // Число с плавающей точкой, занимает 4 байта
        double d = 0.0; // Число с плавающей точкой, занимает 8 байт

        // Вывод значений чисел с плавающей точкой
        System.out.println("float: " + f);
        System.out.println("double: " + d);

        // Пример типа char (символ)
        char c = '\u0000'; // Начальное значение char (нулевой символ)
        System.out.println("char: [" + c + "]");

        // Пример булевого типа
        boolean bool = false; // Логический тип (истина/ложь)
        System.out.println("boolean: " + bool);

        // Пример ссылочных типов
        String str = null; // Ссылка на объект String (начальное значение null)
        Integer integerObject = null; // Ссылка на объект Integer (начальное значение null)

        // Вывод значений ссылочных типов
        System.out.println("String: " + str);
        System.out.println("Integer object: " + integerObject);

        // Пример массивов с примитивными и ссылочными типами
        int[] intArray = new int[3]; // Массив целых чисел (инициализируется нулями)
        String[] strArray = new String[3]; // Массив строк (инициализируется null)
        System.out.println("intArray[0]: " + intArray[0]); // Вывод первого элемента
        System.out.println("strArray[0]: " + strArray[0]); // Вывод первого элемента

        // Пример вывода имени с использованием Unicode
        System.out.println("\u0422\u0438\u043C\u043E\u0444\u0435\u0439"); // Вывод Тимофей в формате Unicode

        // Примеры строкового сложения с разными типами
        int number = 42; // Целое число
        double price = 9.99; // Число с плавающей точкой
        String name = "Тимофей"; // Строка
        String greeting = "Привет, "; // Строка

        // Создание строк с использованием оператора +
        String result1 = greeting + name; // Сложение строк
        String result2 = "Цена: " + price; // Сложение строки и числа
        String result3 = "Число: " + number; // Сложение строки и числа
        Integer integerValue = 100; // Объект типа Integer
        String result4 = "Значение: " + integerValue; // Сложение строки и объекта

        // Вывод результатов строковых операций
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        // Пример арифметических операций с разными типами
        byte a = 10; // Переменная типа byte
        short b2 = 20; // Переменная типа short
        int result = a + b2; // Сложение byte и short, результат автоматически преобразуется в int
        System.out.println(result);

        // Пример работы с типом char
        char a2 = 'A'; // Символ 'A' (в Unicode имеет значение 65)
        int b3 = 5; // Переменная типа int
        int result5 = a2 + b3; // Сложение char и int (char преобразуется в int)
        System.out.println(result5); // Результат: 70 (65 + 5)

        // Пример сужающего преобразования типов
        double doubleValue = 9.78; // Число с плавающей точкой
        int intValue = (int) doubleValue; // Преобразование double в int (отбрасывается дробная часть)
        System.out.println("Double value: " + doubleValue);
        System.out.println("Int value: " + intValue);

        long longValue = 1000L; // Целое число типа long
        short shortValue = (short) longValue; // Преобразование long в short
        System.out.println("Long value: " + longValue);
        System.out.println("Short value: " + shortValue);

        // Примеры использования вывода типов с var
        var number2 = 10; // Тип автоматически определяется как int
        System.out.println("Тип number: " + ((Object) number2).getClass().getSimpleName());

        var text = "Hello, Java!"; // Тип автоматически определяется как String
        System.out.println("Тип text: " + ((Object) text).getClass().getSimpleName());

        var list = new ArrayList<String>(); // Тип определяется как ArrayList<String>
        list.add("Java");
        list.add("Type Inference");
        System.out.println("Тип list: " + list.getClass().getSimpleName());
    }
}
