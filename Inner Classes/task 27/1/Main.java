public class Main {
    public static void main(String[] args) {
        // Создаем внешний класс
        OuterClass outer = new OuterClass();

        // Доступ к приватному внутреннему классу
        outer.createPrivateInnerClass(); // Можно использовать только внутри внешнего класса

        // Доступ к пакету (default) внутреннему классу
        outer.createDefaultInnerClass(); // Можно использовать внутри того же пакета

        // Доступ к защищенному внутреннему классу (внутри подкласса)
        outer.createProtectedInnerClass(); // Можно использовать в том же пакете или в наследнике
        SubClass sub = new SubClass();
        sub.createProtectedInnerClassFromSubclass(); // Доступ через подкласс

        // Доступ к публичному внутреннему классу
        outer.createPublicInnerClass(); // Можно использовать в любом классе

        // Создание и использование статического вложенного класса
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display(); // Создание и использование статического вложенного класса
    }
}