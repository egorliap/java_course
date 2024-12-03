public class OuterClass {

    // Приватный внутренний класс
    private class PrivateInnerClass {
        void display() {
            System.out.println("This is a private inner class.");
        }
    }

    // Внутренний класс с пакетом (default)
    class DefaultInnerClass {
        void display() {
            System.out.println("This is a default (package-private) inner class.");
        }
    }

    // Защищенный внутренний класс
    protected class ProtectedInnerClass {
        void display() {
            System.out.println("This is a protected inner class.");
        }
    }

    // Публичный внутренний класс
    public class PublicInnerClass {
        void display() {
            System.out.println("This is a public inner class.");
        }
    }

    // Статический вложенный класс
    static class StaticNestedClass {
        void display() {
            System.out.println("This is a static nested class.");
        }
    }

    // Методы для создания экземпляров внутренних классов
    public void createPrivateInnerClass() {
        PrivateInnerClass privateInner = new PrivateInnerClass();
        privateInner.display();
    }

    public void createDefaultInnerClass() {
        DefaultInnerClass defaultInner = new DefaultInnerClass();
        defaultInner.display();
    }

    public void createProtectedInnerClass() {
        ProtectedInnerClass protectedInner = new ProtectedInnerClass();
        protectedInner.display();
    }

    public void createPublicInnerClass() {
        PublicInnerClass publicInner = new PublicInnerClass();
        publicInner.display();
    }
}

class SubClass extends OuterClass {
    // Метод для создания защищенного внутреннего класса из подкласса
    public void createProtectedInnerClassFromSubclass() {
        ProtectedInnerClass protectedInner = new ProtectedInnerClass();
        protectedInner.display();
    }
}