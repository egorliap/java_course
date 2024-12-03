public class A {
    public static int a = 1;
    public static int b;

    // Статический метод для вывода значений полей
    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    // Другой статический метод, который вызывает printVars()
    public static void anotherMethod() {
        printVars(); // Вызов через другой статический метод
    }
}
