public class MyClass implements MyInterface {

    // Реализация абстрактного метода
    @Override
    public void abstractMethod() {
        System.out.println("This is the abstract method implementation.");
    }

    // Можно переопределить метод default (необязательно)
    @Override
    public void defaultMethod() {
        System.out.println("This is the overridden default method.");
    }
}
