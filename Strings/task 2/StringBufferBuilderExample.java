public class StringBufferBuilderExample {
    public static void main(String[] args) {

        // Пример 1: StringBuilder - создание объекта
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("StringBuilder: " + sb);

        // Пример 2: append() - добавление текста в конец строки
        sb.append(" World");
        System.out.println("append(): " + sb);  // Выведет: Hello World

        // Пример 3: insert() - вставка текста в указанную позицию
        sb.insert(6, "Java ");
        System.out.println("insert(): " + sb);  // Выведет: Hello Java World

        // Пример 4: delete() - удаление символов с указанного диапазона
        sb.delete(6, 10);  // Удалим "Java" (с позиции 6 по 10)
        System.out.println("delete(): " + sb);  // Выведет: Hello World

        // Пример 5: replace() - замена текста в указанном диапазоне
        sb.replace(6, 11, "Everyone");
        System.out.println("replace(): " + sb);  // Выведет: Hello Everyone

        // Пример 6: reverse() - переворот строки
        sb.reverse();
        System.out.println("reverse(): " + sb);  // Выведет: enoyrevE olleH

        // Пример 7: StringBuffer - создание объекта
        StringBuffer sbf = new StringBuffer("Initial");
        System.out.println("StringBuffer: " + sbf);

        // Пример 8: append() - добавление текста в конец строки (для StringBuffer)
        sbf.append(" String");
        System.out.println("append() (StringBuffer): " + sbf);  // Выведет: Initial String

        // Пример 9: capacity() - проверка текущей ёмкости буфера
        System.out.println("capacity() (StringBuffer): " + sbf.capacity());  // Выведет: 32 (по умолчанию 16 + длина строки)

        // Пример 10: ensureCapacity() - увеличение ёмкости, если текущей недостаточно
        sbf.ensureCapacity(100);  // Устанавливаем ёмкость 100 символов
        System.out.println("capacity() after ensureCapacity (StringBuffer): " + sbf.capacity());  // Выведет: 100

        // Пример 11: toString() - преобразование StringBuffer в строку
        String result = sbf.toString();
        System.out.println("toString() (StringBuffer): " + result);  // Выведет: Initial String
    }
}
