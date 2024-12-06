public class ExceptionHierarchyExample {

    // Базовое исключение
    static class Ex1 extends Exception {}
    // Подкласс Ex1
    static class Ex2 extends Ex1 {}
    // Подкласс Ex2
    static class Ex3 extends Ex2 {}

    public static void main(String[] args) {
        try {
            // Генерация исключения
            throw new Ex3();  // Это исключение является объектом типа Ex3, но может быть поймано как Ex1, Ex2 или Ex3

        } catch (Ex3 e) {
            // Обработка исключения типа Ex3
            System.out.println("Ловим исключение типа: " + e.getClass().getSimpleName());
        } catch (Ex2 e) {
            // Обработка исключения типа Ex2
            System.out.println("Ловим исключение типа: " + e.getClass().getSimpleName());
        } catch (Ex1 e) {
            // Обработка исключения типа Ex1
            System.out.println("Ловим исключение типа: " + e.getClass().getSimpleName());
        }
        
        System.out.println("Программа завершена.");
    }
}
