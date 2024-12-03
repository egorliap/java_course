import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Создание различных списков
        List<Number> numbers = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        
        // Добавление чисел в списки
        integers.add(1);
        integers.add(2);
        numbers.add(3.14);
        numbers.add(10);
        
        // Пример с <? extends T> - можем извлекать элементы
        addNumbers(integers);
        addNumbers(numbers);
        
        // Пример с <? super T> - можем добавлять элементы
        addToList(integers);
        addToList(numbers);
    }

    // Метод для извлечения элементов из списка, который может содержать подтипы Number
    public static void addNumbers(List<? extends Number> list) {
        // Мы можем извлекать элементы, но не можем добавлять
        for (Object num : list) {
            System.out.println("Extracted: " + num);
        }
    }

    // Метод для добавления элементов в список, который может содержать суперклассы Integer
    public static void addToList(List<? super Integer> list) {
        // можем добавить Integer, но не можем извлекать элементы с гарантией типа
        list.add(10);
        System.out.println("After adding: " + list);
    }
}
