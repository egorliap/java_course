# Практика #1
## Что выведет данный код и почему?

public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}

static logic Статические блоки инициализации выполняются единожды при загрузке класса в память JVM, перед созданием любого экземпляра.
logic (1) id= 0 После загрузки класса и при создании экземпляра, сначала выполняются нестатические инициализационные блоки в порядке их объявления в коде
logic (2) id= 1
ctor id= 100 После выполнения всех инициализационных блоков вызывается тело конструктора