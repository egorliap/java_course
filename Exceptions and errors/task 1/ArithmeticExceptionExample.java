public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Генерация исключения: попытка деления на 0
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Деление на ноль
        }
    }
}
