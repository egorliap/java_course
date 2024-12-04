public interface MyInterface {
    // Абстрактный метод (обязателен для реализации в классе)
    void abstractMethod();

    // Неабстрактный метод с реализацией по умолчанию
    default void defaultMethod() {
        System.out.println("This is the default method.");
    }

    // Статический метод
    static void staticMethod() {
        System.out.println("This is a static method from the interface.");
    }
}
