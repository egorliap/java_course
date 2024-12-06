import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        // Указываем путь к файлу
        String fileName = "example.txt"; // Убедитесь, что файл существует

        // Попытка чтения файла с использованием FileInputStream
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int byteRead;
            // Чтение байтов до конца файла
            while ((byteRead = fis.read()) != -1) {
                // Печатаем каждый прочитанный байт (символ в ASCII)
                System.out.print((char) byteRead);
            }
        } catch (IOException e) {
            // Обработка ошибок ввода-вывода
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
