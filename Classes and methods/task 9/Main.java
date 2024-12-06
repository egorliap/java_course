public class Main {

    // Определение перечисления с инициализацией элементов
    public enum Day {
        MONDAY("Понедельник", "Начало недели"),
        TUESDAY("Вторник", "Второй день недели"),
        WEDNESDAY("Среда", "Середина недели"),
        THURSDAY("Четверг", "Почти конец недели"),
        FRIDAY("Пятница", "Конец недели"),
        SATURDAY("Суббота", "Выходной"),
        SUNDAY("Воскресенье", "Выходной");

        private final String name;
        private final String description;

        // Конструктор перечисления
        Day(String name, String description) {
            this.name = name;
            this.description = description;
        }

        // Метод для получения полного описания дня
        public String getDescription() {
            return name + ": " + description;
        }
    }

    public static void main(String[] args) {
        // Инициализация переменной типа Day
        Day day = Day.MONDAY;

        // Использование switch с перечислением
        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Выходной день!");
                break;
            default:
                System.out.println("Рабочий день.");
                break;
        }

        // Использование метода перечисления
        System.out.println(day.getDescription());
    }
}
