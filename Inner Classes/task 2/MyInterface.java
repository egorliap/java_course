// Интерфейс с вложенным классом
public interface MyInterface {

    // Поле интерфейса
    String INTERFACE_FIELD = "Interface Field";

    // Вложенный класс
    static class NestedClass {
        public void display() {
            System.out.println("This is a method in a nested class inside an interface.");
            System.out.println("Accessing static field of interface: " + INTERFACE_FIELD);
        }
    }

    // Абстрактный метод интерфейса
    void abstractMethod();
}

