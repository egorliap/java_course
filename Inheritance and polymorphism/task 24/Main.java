class Animal {
    // Метод в суперклассе
    public void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    // Переопределение метода в подклассе
    @Override
    public void speak() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.speak();  // Выведет: Animal speaks

        Dog dog = new Dog();
        dog.speak();  // Выведет: Dog barks
    }
}
