public class Main {
    // Метод для чисел
    public static void printValues(int... numbers) {
        System.out.println("Printing integers:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Метод для строк
    public static void printValues(String... strings) {
        System.out.println("Printing strings:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Метод для объектов
    public static void printValues(Object obj) {
        System.out.println("Printing single object:");
        System.out.println(obj);
    }

    public static void main(String[] args) {
        // Вызов метода с числами
        printValues(1, 2, 3, 4);

        // Вызов метода со строками
        printValues("Hello", "World", "VarArgs");

        // Вызов метода с одним объектом
        printValues("Single Object");
    }
}
