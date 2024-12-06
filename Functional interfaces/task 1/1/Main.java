public class Main {
    public static void main(String[] args) {
        // Создание объекта класса MyClass, который реализует MyInterface
        MyClass myClass = new MyClass();

        // Вызов абстрактного метода
        myClass.abstractMethod(); // Выведет: This is the abstract method implementation.

        // Вызов метода default (который может быть переопределён в классе)
        myClass.defaultMethod(); // Выведет: This is the overridden default method.

        // Вызов статического метода из интерфейса
        MyInterface.staticMethod(); // Выведет: This is a static method from the interface.
    }
}
