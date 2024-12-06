public class OuterClass {

    // Поля внутреннего класса с разными модификаторами доступа
    public class PublicInnerClass {
        public String publicField = "Public Field in InnerClass";
        private String privateField = "Private Field in InnerClass";
        
        public void publicMethod() {
            System.out.println("Public Method in InnerClass");
        }
        
        private void privateMethod() {
            System.out.println("Private Method in InnerClass");
        }
    }

    // Внешний класс имеет доступ к публичным методам и полям внутреннего класса
    public void accessInnerClass() {
        // Создание экземпляра внутреннего класса
        PublicInnerClass innerClass = new PublicInnerClass();
        
        // Доступ к публичному полю и методу
        System.out.println(innerClass.publicField);  // Доступно
        innerClass.publicMethod();  // Доступно
        
        // Попытка доступа к приватному полю и методу (не разрешено)
        // Следующие строки вызовут ошибку компиляции
        // System.out.println(innerClass.privateField);  // Ошибка: privateField имеет модификатор private
        // innerClass.privateMethod();  // Ошибка: privateMethod имеет модификатор private
    }
}