public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessFields(); // Внутренний класс имеет доступ ко всем полям и методам

        // Создание экземпляра подкласса
        SubClass sub = new SubClass();
        sub.accessProtectedField(); // Доступ к protected полям и методам
    }
}