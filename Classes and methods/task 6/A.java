public class A {
    // Метод для обработки объектов типа Integer
    public void printNum(Integer i) {
        System.out.printf("Integer = %d%n", i);
    }

    // Метод для обработки примитивного типа int
    public void printNum(int i) {
        System.out.printf("int = %d%n", i);
    }

    // Метод для обработки объектов типа Float
    public void printNum(Float f) {
        System.out.printf("Float = %.4f%n", f);
    }

    // Метод для обработки объектов типа Number (родитель всех числовых типов)
    public void printNum(Number n) {
        System.out.println("Number=" + n);
    }
}