public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;

        try {
            // Генерация исключения: попытка вызвать метод на null
            int length = str.length();
        } catch (NullPointerException e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Обращение к методу на null
        }
    }
}
