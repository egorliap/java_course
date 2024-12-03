/**
 * Этот класс демонстрирует использование утилиты Javadoc.
 */
public class Main {

    /**
     * Возвращает сумму двух чисел.
     * 
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Main example = new Main();
        System.out.println("Сумма: " + example.add(5, 3));
    }
}
