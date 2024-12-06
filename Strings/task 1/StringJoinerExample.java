import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        
        // 1. Простой пример с разделителем
        StringJoiner joiner1 = new StringJoiner(", "); // Указываем разделитель: ", "
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Orange");
        System.out.println("joiner1: " + joiner1); // Выведет: Apple, Banana, Orange

        // 2. Пример с разделителем, префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(", ", "[", "]");
        joiner2.add("Dog");
        joiner2.add("Cat");
        joiner2.add("Rabbit");
        System.out.println("joiner2: " + joiner2); // Выведет: [Dog, Cat, Rabbit]

        // 3. Пример с пустым StringJoiner (результат будет пустой строкой)
        StringJoiner joiner3 = new StringJoiner(", ");
        System.out.println("joiner3: " + joiner3); // Выведет: (пустую строку)

        // 4. Использование метода setEmptyValue() для задания значения для пустого StringJoiner
        StringJoiner joiner4 = new StringJoiner(", ");
        joiner4.setEmptyValue("No items");
        System.out.println("joiner4 (empty value): " + joiner4); // Выведет: No items

        // 5. Объединение StringJoiner с другими строками
        StringJoiner joiner5 = new StringJoiner(", ");
        joiner5.add("Sun");
        joiner5.add("Moon");
        String result = joiner5.toString() + " and Stars";
        System.out.println("joiner5 with added string: " + result); // Выведет: Sun, Moon and Stars
    }
}
