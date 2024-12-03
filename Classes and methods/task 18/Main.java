// Параметризированный класс Box
class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Параметризированный интерфейс Container
interface Container<T> {
    void add(T item);
}

// Реализация интерфейса Container для String
class StringContainer implements Container<String> {
    @Override
    public void add(String item) {
        System.out.println("Adding String: " + item);
    }
}

// Реализация интерфейса Container для Integer
class IntegerContainer implements Container<Integer> {
    @Override
    public void add(Integer item) {
        System.out.println("Adding Integer: " + item);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем объекты параметризированных классов Box
        Box<Integer> intBox = new Box<>(10);
        Box<String> stringBox = new Box<>("Hello");

        // Использование instanceof с параметризованными типами
        if (intBox instanceof Box<?>) {
            System.out.println("intBox is an instance of Box");
        }
        if (stringBox instanceof Box<?>) {
            System.out.println("stringBox is an instance of Box");
        }

        // Создание объектов для проверки с интерфейсами
        Container<String> stringContainer = new StringContainer();
        Container<Integer> integerContainer = new IntegerContainer();

        // Проверка объектов с параметризованным интерфейсом
        if (stringContainer instanceof Container<?>) {
            System.out.println("stringContainer is an instance of Container");
        }
        if (integerContainer instanceof Container<?>) {
            System.out.println("integerContainer is an instance of Container");
        }

        // Пример использования конкретных типов в instanceof (не работает)
        // Ошибка компиляции: нельзя использовать конкретный параметр типа
        // if (intBox instanceof Box<Integer>) { // Ошибка!
        //     System.out.println("intBox is an instance of Box<Integer>");
        // }

        // Пример с wildcard (не проверяется конкретный тип)
        if (stringContainer instanceof Container) {
            System.out.println("stringContainer is an instance of raw Container");
        }
    }
}
