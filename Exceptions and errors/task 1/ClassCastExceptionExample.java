public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object obj = "Hello, World!";

        try {
            // Генерация исключения: попытка приведения типа
            Integer num = (Integer) obj; // Приведение строки к типу Integer
        } catch (ClassCastException e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Невозможно привести тип
        }
    }
}
