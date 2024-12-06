public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            // Генерация исключения: передача недопустимого значения
            setAge(-5);
        } catch (IllegalArgumentException e) {
            // Обработка исключения
            System.out.println("Ошибка: " + e.getMessage()); // Неверный аргумент
        }
    }

    public static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст: " + age);
    }
}
