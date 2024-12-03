class Calculator {

    // Перегруженный метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    public double add(double a, double b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех чисел с плавающей точкой
    public double add(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Вызовы перегруженных методов
        System.out.println("Сложение двух целых чисел: " + calc.add(5, 10));
        System.out.println("Сложение трех целых чисел: " + calc.add(5, 10, 15));
        System.out.println("Сложение двух чисел с плавающей точкой: " + calc.add(5.5, 10.5));
        System.out.println("Сложение трех чисел с плавающей точкой: " + calc.add(5.5, 10.5, 15.5));
    }
}
