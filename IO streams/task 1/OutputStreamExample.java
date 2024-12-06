import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String fileName = "output.txt"; // Убедитесь, что у вас есть права на запись в данный файл

        // Попытка записи данных в файл с использованием FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            String text = "Hello, world!"; // Текст для записи в файл

            // Запись текста в файл побайтово
            for (int i = 0; i < text.length(); i++) {
                fos.write(text.charAt(i)); // Записываем символ в виде байта
            }

            System.out.println("Текст был записан в файл.");
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
