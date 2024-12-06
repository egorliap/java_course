import java.util.Formatter;
import java.util.Date;

public class DateFormatterExample {
    public static void main(String[] args) {
        
        // Текущая дата и время
        Date now = new Date();
        
        // Создаем объект Formatter для вывода в консоль
        Formatter formatter = new Formatter();

        // Пример 1: %tH — Час (00–23)
        formatter.format("Hour (24-hour format): %tH%n", now); // %tH — час в 24-часовом формате
        System.out.println(formatter.toString());

        // Пример 2: %tA — Полное название дня недели
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Day of the week: %tA%n", now);  // %tA — день недели
        System.out.println(formatter.toString());

        // Пример 3: %tB — Полное название месяца
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Month: %tB%n", now);  // %tB — название месяца
        System.out.println(formatter.toString());

        // Пример 4: %tm — Месяц в двузначном формате (1–12)
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Month (2 digits): %tm%n", now);  // %tm — месяц в двузначном формате
        System.out.println(formatter.toString());

        // Пример 5: %tY — Год в четырехзначном формате
        formatter = new Formatter();  // сбрасываем formatter для нового примера
        formatter.format("Year (4 digits): %tY%n", now);  // %tY — год в четырехзначном формате
        System.out.println(formatter.toString());

        // Закрытие ресурса
        formatter.close();
    }
}
