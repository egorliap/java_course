// Суперкласс Animal
class Animal {

    // Метод в суперклассе
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

// Класс Dog, который наследует Animal и переопределяет метод sound
class Dog extends Animal {

    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

// Класс Cat, который наследует Animal и переопределяет метод sound
class Cat extends Animal {

    // Переопределение метода sound
    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

// Класс Calculator для демонстрации перегрузки методов
class Calculator {

    // Перегрузка метода sum с двумя параметрами типа int
    public int sum(int a, int b) {
        return a + b;
    }

    // Перегрузка метода sum с тремя параметрами типа int
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка метода sum с параметрами типа double
    public double sum(double a, double b) {
        return a + b;
    }
}

public class Main {

    public static void main(String[] args) {
        // Демонстрация перегрузки методов
        Calculator calc = new Calculator();
        System.out.println("Сумма 2-х чисел: " + calc.sum(2, 3));        // int
        System.out.println("Сумма 3-х чисел: " + calc.sum(1, 2, 3));      // int
        System.out.println("Сумма 2-х чисел (double): " + calc.sum(1.5, 2.5)); // double

        // Демонстрация переопределения методов
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Вызов метода sound в разных классах
        animal.sound(); // Животное издает звук
        dog.sound();    // Собака лает
        cat.sound();    // Кошка мяукает
    }
}
