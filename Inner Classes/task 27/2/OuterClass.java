public class OuterClass {

    // Поля с разными спецификаторами доступа
    private int privateField = 10;
    int defaultField = 20; // Пакетный доступ
    protected int protectedField = 30;
    public int publicField = 40;

    // Методы с разными спецификаторами доступа
    private void privateMethod() {
        System.out.println("Private method in OuterClass");
    }

    void defaultMethod() {
        System.out.println("Default (package-private) method in OuterClass");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in OuterClass");
    }

    public void publicMethod() {
        System.out.println("Public method in OuterClass");
    }

    // Внутренний класс
    public class InnerClass {
        public void accessFields() {
            // Доступ к полям внешнего класса
            System.out.println("Accessing private field: " + privateField);
            System.out.println("Accessing default field: " + defaultField);
            System.out.println("Accessing protected field: " + protectedField);
            System.out.println("Accessing public field: " + publicField);

            // Доступ к методам внешнего класса
            privateMethod(); // Внутренний класс может обращаться к private методам
            defaultMethod(); // Доступ к default методу
            protectedMethod(); // Доступ к protected методу
            publicMethod(); // Доступ к public методу
        }
    }
}

class SubClass extends OuterClass {
    public void accessProtectedField() {
        // Создание экземпляра внутреннего класса
        InnerClass inner = new InnerClass();
        inner.accessFields(); // Внутренний класс имеет доступ к защищенным полям

        // Вызов protected метода внешнего класса
        protectedMethod();
    }
}