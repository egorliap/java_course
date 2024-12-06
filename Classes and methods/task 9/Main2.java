public class Main2 {

    // Определение перечисления с дополнительным методом
    public enum CarType {
        SEDAN("Седан", 5000),
        SUV("Внедорожник", 8000),
        TRUCK("Грузовик", 12000),
        COUPE("Купе", 6000),
        CONVERTIBLE("Кабриолет", 7000);

        private final String description;
        private final int insuranceCost;  // Стоимость страховки

        // Конструктор перечисления
        CarType(String description, int insuranceCost) {
            this.description = description;
            this.insuranceCost = insuranceCost;
        }

        // Метод для получения описания автомобиля
        public String getDescription() {
            return description;
        }

        // Метод для получения стоимости страховки
        public int getInsuranceCost() {
            return insuranceCost;
        }
    }

    public static void main(String[] args) {
        // Пример использования перечисления
        CarType car = CarType.SUV;

        // Вывод информации о типе автомобиля
        System.out.println("Тип автомобиля: " + car.getDescription());
        System.out.println("Стоимость страховки: " + car.getInsuranceCost() + " руб.");

        // Использование switch для разных типов автомобилей
        switch (car) {
            case SEDAN:
                System.out.println("У вас комфортный семейный автомобиль!");
                break;
            case SUV:
                System.out.println("Мощный внедорожник, готов к любым условиям!");
                break;
            case TRUCK:
                System.out.println("Мощный грузовик, идеально подходит для перевозок.");
                break;
            case COUPE:
                System.out.println("Стильное купе для любителей скорости!");
                break;
            case CONVERTIBLE:
                System.out.println("Кабриолет — лучший выбор для летних дней!");
                break;
            default:
                System.out.println("Неизвестный тип автомобиля.");
                break;
        }
    }
}
