// Собственное исключение, унаследованное от класса Exception
public class MyFirstException extends Exception {

    // Конструктор без параметров
    public MyFirstException() {
        super("Произошла ошибка в MyFirstException");
    }

    // Конструктор с параметром для сообщения об ошибке
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с параметром для сообщения и причиной (другое исключение)
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }

    // Конструктор с причиной (другим исключением)
    public MyFirstException(Throwable cause) {
        super(cause);
    }
}
