public class Main {
    public static void main(String[] args) {
        // Целые типы
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("value = 1");
                break;
            case 2:
                System.out.println("value = 2");
                break;
            default:
                System.out.println("value != 1 и value != 2");
        }

        // Перечисления (enum)
        enum Days { MONDAY, TUESDAY, WEDNESDAY }
        Days day = Days.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

        // Классы-оболочки
        Integer boxedValue = 10;
        switch (boxedValue) {
            case 5:
                System.out.println("Value is 5");
                break;
            case 10:
                System.out.println("Value is 10");
                break;
            default:
                System.out.println("Unknown value");
        }

        // Строки
        String fruit = "Apple";
        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple");
                break;
            case "Banana":
                System.out.println("It's a banana");
                break;
            default:
                System.out.println("Unknown fruit");
        }

        // Использование var
        var dynamicValue = "Hello";
        switch (dynamicValue) {
            case "Hello":
                System.out.println("Greeting detected");
                break;
            case "Goodbye":
                System.out.println("Farewell detected");
                break;
            default:
                System.out.println("Unknown phrase");
        }
    }
}