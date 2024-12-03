public class A {
    {
        System.out.println("logic (1) id= " + this.id);  // Логический блок (1)
    }

    static {
        System.out.println("static logic");  // Статический блок
    }

    private int id = 1;  // Инициализация поля id

    public A(int id) {
        this.id = id;  // Инициализация поля id с использованием конструктора
        System.out.println("ctor id= " + id);  // Вывод значения id из конструктора
    }

    {
        System.out.println("logic (2) id= " + id);  // Логический блок (2)
    }
}
