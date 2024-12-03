public class Main {
    public static void main(String[] args) {
        // Создание экземпляра внешнего класса
        OuterClass outer = new OuterClass();
        
        // Вызов метода внешнего класса для доступа к полям и методам внутреннего класса
        outer.accessInnerClass();
    }
}