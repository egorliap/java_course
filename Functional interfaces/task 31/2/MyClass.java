public class MyClass implements InterfaceA, InterfaceB {
    // Ошибка компиляции: оба интерфейса предоставляют метод с дефолтной реализацией.
    // Необходимо явно переопределить метод printMessage.

    @Override
    public void printMessage() {
        // Явное разрешение конфликта: выбираем, какую реализацию использовать
        InterfaceA.super.printMessage(); // Вызов реализации из InterfaceA
        // или
        // InterfaceB.super.printMessage(); // Вызов реализации из InterfaceB
    }
}
