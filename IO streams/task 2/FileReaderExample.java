import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        File file = new File("example.txt");

        try {
            // Создаем объект Scanner для чтения из файла
            Scanner scanner = new Scanner(file);

            // Чтение данных из файла
            while (scanner.hasNext()) {
                String line = scanner.nextLine();  // Чтение строки из файла
                System.out.println(line);           // Вывод строки на консоль
            }

            // Закрытие Scanner после завершения работы
            scanner.close();
        } catch (FileNotFoundException e) {
            // Обработка исключения, если файл не найден
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
