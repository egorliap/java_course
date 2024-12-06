// Суперкласс
class Parent {
    int a = 10; // Поле суперкласса

    public Parent() {
        System.out.println("Конструктор суперкласса");
    }

    public void display() {
        System.out.println("Метод суперкласса");
    }
}

// Подкласс
class Child extends Parent {
    int a = 20; // Поле подкласса

    // Конструктор подкласса
    public Child() {
        // Использование super() для вызова конструктора суперкласса
        super();  
        System.out.println("Конструктор подкласса");
    }

    // Переопределение метода display
    @Override
    public void display() {
        // Использование super для вызова метода суперкласса
        super.display();
        System.out.println("Метод подкласса");
    }

    public void show() {
        // Использование super для доступа к полю суперкласса
        System.out.println("Поле суперкласса a: " + super.a);
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание объекта подкласса
        Child child = new Child();
        
        // Вызов метода display()
        child.display();
        
        // Вызов метода show() для доступа к полю суперкласса
        child.show();
    }
}
