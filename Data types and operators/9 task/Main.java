public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Бесконечный цикл while");
        }
        
        do {
            System.out.println("Бесконечный цикл do-while");
        } while (true);

        int[] arr = {1, 3, 5, 7, 9};

        System.out.println("Пример с break:");
        for (int elem : arr) {
            if (elem == 5) {
                break; // Прерываем цикл, когда находим элемент 5
            }
            System.out.printf("%d ", elem);
        }

        System.out.println("\n\nПример с continue:");
        for (int elem : arr) {
            if (elem == 5) {
                continue; // Пропускаем элемент 5
            }
            System.out.printf("%d ", elem);
        }
    }
}
