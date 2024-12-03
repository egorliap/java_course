import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        
        a1 = a2; // Переназначаем ссылку a1
        
        // Выводим элементы a1 (которые теперь совпадают с a2)
        for (int elem : a1) {
            System.out.print(elem + " ");
        }

        // Создание массивов
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {5, 4, 3, 2, 1};
        
        // Преобразование массива в строку
        System.out.println("Строковое представление массива arr1: " + Arrays.toString(arr1));
        
        // Бинарный поиск элемента в отсортированном массиве
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("Индекс элемента 3 в arr1: " + index);
        
        // Сравнение массивов
        System.out.println("Массивы arr1 и arr2 равны? " + Arrays.equals(arr1, arr2));
        System.out.println("Массивы arr1 и arr3 равны? " + Arrays.equals(arr1, arr3));
        
        // Сравнение двух массивов
        System.out.println("Сравнение arr1 и arr2: " + Arrays.compare(arr1, arr2)); // 0, т.к. массивы одинаковые
        System.out.println("Сравнение arr1 и arr3: " + Arrays.compare(arr1, arr3)); // Положительное, так как arr1 > arr3

        // Сортировка массива
        Arrays.sort(arr3);
        System.out.println("Отсортированный массив arr3: " + Arrays.toString(arr3));
    }
}
