public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            // Генерация исключения: выход за пределы массива
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Индекс вне диапазона
        }
    }
}
