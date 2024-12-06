class MyClass {
    
    // private - доступ только внутри этого класса
    private int privateVar = 1;
    
    // по умолчанию (default) - доступ только в том же пакете
    int defaultVar = 2;
    
    // protected - доступ в том же пакете и в подклассах (даже если они находятся в других пакетах)
    protected int protectedVar = 3;
    
    // public - доступ во всем проекте, включая другие пакеты
    public int publicVar = 4;
    
    // Конструктор с разными спецификаторами
    public MyClass() {
        System.out.println("Конструктор MyClass вызван.");
    }

    // Метод с разными спецификаторами
    public void publicMethod() {
        System.out.println("Публичный метод.");
    }
    
    private void privateMethod() {
        System.out.println("Приватный метод.");
    }
    
    protected void protectedMethod() {
        System.out.println("Защищенный метод.");
    }
    
    void defaultMethod() {
        System.out.println("Метод по умолчанию.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Пример доступа к переменным и методам
        System.out.println("publicVar: " + obj.publicVar); // доступно
        System.out.println("defaultVar: " + obj.defaultVar); // доступно в том же пакете
        System.out.println("protectedVar: " + obj.protectedVar); // доступно в том же пакете
        // System.out.println("privateVar: " + obj.privateVar); // ошибка, private переменная недоступна

        obj.publicMethod(); // доступно
        // obj.privateMethod(); // ошибка, private метод недоступен
        obj.protectedMethod(); // доступно в том же пакете
        obj.defaultMethod(); // доступно в том же пакете

        // В другом классе того же пакета будет также доступен доступ по умолчанию, protected и public.
    }
}
