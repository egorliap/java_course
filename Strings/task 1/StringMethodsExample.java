public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. Метод length() — возвращает длину строки
        String str1 = "Hello, World!";
        System.out.println("Length of str1: " + str1.length()); // Выведет: 13

        // 2. Метод toUpperCase() — преобразует все символы строки в верхний регистр
        String str2 = "hello";
        System.out.println("str2 in uppercase: " + str2.toUpperCase()); // Выведет: HELLO

        // 3. Метод toLowerCase() — преобразует все символы строки в нижний регистр
        System.out.println("str2 in lowercase: " + str2.toLowerCase()); // Выведет: hello

        // 4. Метод substring(int startIndex) — возвращает подстроку начиная с индекса startIndex до конца строки
        String str3 = "Hello, World!";
        String subStr1 = str3.substring(7); // Начинаем с индекса 7
        System.out.println("Substring from index 7: " + subStr1); // Выведет: World!

        // 5. Метод substring(int startIndex, int endIndex) — возвращает подстроку в пределах индексов startIndex и endIndex
        String subStr2 = str3.substring(0, 5); // От 0 до 5
        System.out.println("Substring from index 0 to 5: " + subStr2); // Выведет: Hello

        // 6. Метод equals(Object obj) — проверяет, одинаковы ли строки (сравнивает содержимое)
        String str4 = "Hello, World!";
        System.out.println("str1 equals str4: " + str1.equals(str4)); // Выведет: true

        // 7. Метод equalsIgnoreCase(String other) — сравнивает строки без учёта регистра
        String str5 = "hello, world!";
        System.out.println("str1 equals str5 (ignore case): " + str1.equalsIgnoreCase(str5)); // Выведет: true

        // 8. Метод replace(char oldChar, char newChar) — заменяет символы в строке
        String str6 = "banana";
        System.out.println("Replace 'a' with 'o': " + str6.replace('a', 'o')); // Выведет: bonono

        // 9. Метод contains(CharSequence sequence) — проверяет, содержит ли строка заданную подстроку
        String str7 = "I love programming!";
        System.out.println("str7 contains 'program': " + str7.contains("program")); // Выведет: true

        // 10. Метод trim() — удаляет начальные и конечные пробелы из строки
        String str8 = "   Hello with spaces!   ";
        System.out.println("Trimmed str8: '" + str8.trim() + "'"); // Выведет: 'Hello with spaces!'
    }
}
