public class Main {
    public static void main(String[] args) {
        // Арифметические операторы
        int a = 10, b = 3;
        System.out.println("Сложение: " + (a + b)); // Сложение
        System.out.println("Вычитание: " + (a - b)); // Вычитание
        System.out.println("Умножение: " + (a * b)); // Умножение
        System.out.println("Деление: " + (a / b)); // Деление (целое число)
        System.out.println("Остаток: " + (a % b)); // Остаток от деления

        // Конкатенация строк
        String greeting = "Привет";
        String name = "Тимофей";
        System.out.println(greeting + ", " + name + "!"); // Конкатенация строк
        int age = 25;
        System.out.println("Возраст: " + age); // Конкатенация строки с числом

        // Инкремент и декремент
        int x = 5;
        System.out.println("Префиксный инкремент: " + (++x)); // Увеличивает x перед использованием
        System.out.println("Постфиксный инкремент: " + (x++)); // Использует x, затем увеличивает
        System.out.println("Значение после постфиксного инкремента: " + x);

        System.out.println("Префиксный декремент: " + (--x)); // Уменьшает x перед использованием
        System.out.println("Постфиксный декремент: " + (x--)); // Использует x, затем уменьшает
        System.out.println("Значение после постфиксного декремента: " + x);

        // Сравнительные операторы
        System.out.println("a == b: " + (a == b)); // Равно
        System.out.println("a != b: " + (a != b)); // Не равно
        System.out.println("a > b: " + (a > b)); // Больше
        System.out.println("a < b: " + (a < b)); // Меньше
        System.out.println("a >= b: " + (a >= b)); // Больше или равно
        System.out.println("a <= b: " + (a <= b)); // Меньше или равно

        // Логические операторы
        boolean bool1 = true, bool2 = false;
        System.out.println("bool1 && bool2: " + (bool1 && bool2)); // Логическое И
        System.out.println("bool1 || bool2: " + (bool1 || bool2)); // Логическое ИЛИ
        System.out.println("!bool1: " + (!bool1)); // Логическое НЕ

        // Операторы присваивания
        a += 3; // a = a + 3
        System.out.println("a += 3: " + a);
        a -= 2; // a = a - 2
        System.out.println("a -= 2: " + a);
        a *= 4; // a = a * 4
        System.out.println("a *= 4: " + a);
        a /= 2; // a = a / 2
        System.out.println("a /= 2: " + a);
        a %= 3; // a = a % 3
        System.out.println("a %= 3: " + a);

        // Побитовые операторы
        int bitwiseA = 5, bitwiseB = 3; // В двоичном формате: a = 0101, b = 0011
        System.out.println("bitwiseA & bitwiseB: " + (bitwiseA & bitwiseB)); // Побитовое И
        System.out.println("bitwiseA | bitwiseB: " + (bitwiseA | bitwiseB)); // Побитовое ИЛИ
        System.out.println("bitwiseA ^ bitwiseB: " + (bitwiseA ^ bitwiseB)); // Побитовое исключающее ИЛИ
        System.out.println("~bitwiseA: " + (~bitwiseA)); // Побитовое НЕ
        System.out.println("bitwiseA << 1: " + (bitwiseA << 1)); // Сдвиг влево
        System.out.println("bitwiseA >> 1: " + (bitwiseA >> 1)); // Сдвиг вправо

        // Пример 1: Проверка объекта на принадлежность к классу
        String str = "Hello, Java!";
        System.out.println("str instanceof String: " + (str instanceof String)); // true

        // Пример 2: Проверка объекта на принадлежность к суперклассу
        Object obj = str;
        System.out.println("obj instanceof Object: " + (obj instanceof Object)); // true

        // Пример 3: Проверка объекта на принадлежность к интерфейсу
        Runnable runnable = new Thread();
        System.out.println("runnable instanceof Runnable: " + (runnable instanceof Runnable)); // true

        // Пример 4: Проверка объекта на принадлежность к классу, не связанному с объектом
        System.out.println("str instanceof Integer: " + (str instanceof String)); // true

        // Пример 5: Применение instanceof к null
        String nullStr = null;
        System.out.println("nullStr instanceof String: " + (nullStr instanceof String)); // false

        // Пример 6: Использование с пользовательскими классами
        Animal animal = new Dog(); // Полиморфизм
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // true
        System.out.println("animal instanceof Cat: " + (animal instanceof Cat)); // false
    }
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
