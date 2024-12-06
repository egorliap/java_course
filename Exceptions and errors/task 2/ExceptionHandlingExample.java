public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация первого исключения, которое будет перехвачено
            int result1 = 10 / 0;  // Деление на ноль, вызовет ArithmeticException

            // Генерация второго исключения, которое не будет перехвачено
            String str = null;
            System.out.println(str.length());  // Вызовет NullPointerException, которое не будет перехвачено
        } catch (ArithmeticException e) {
            // Обработка исключения ArithmeticException
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("Программа завершена");
    }
}
