class Parent {
    // Метод с модификатором final, который нельзя переопределить в подклассе
    public final void printMessage() {
        System.out.println("Сообщение из суперкласса");
    }
}

class Child extends Parent {
    // Попытка переопределить final-метод вызывает ошибку компиляции
    // Следующий код вызовет ошибку:
    // @Override
    // public void printMessage() {
    //     System.out.println("Сообщение из подкласса");
    // }

    // Однако можно создать новый метод с таким же именем, но это не будет переопределением
    public void newMethod() {
        System.out.println("Новый метод в подклассе");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.printMessage();  // Выводит: Сообщение из суперкласса

        Child child = new Child();
        child.printMessage();  // Выводит: Сообщение из суперкласса
        child.newMethod();     // Выводит: Новый метод в подклассе
    }
}
