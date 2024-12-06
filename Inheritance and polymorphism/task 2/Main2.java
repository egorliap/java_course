// Класс с модификатором final
final class Parent {
    public void display() {
        System.out.println("Метод класса Parent");
    }
}

// Класс, который пытается расширить final класс (ошибка компиляции)
class Child extends Parent {  // Ошибка: невозможно наследовать от final класса
    public void display() {
        System.out.println("Метод класса Child");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();  // Вывод: Метод класса Parent
    }
}
