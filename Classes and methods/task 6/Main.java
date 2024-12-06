public class Main {
    public static void main(String[] args) {
        A a = new A();
        
        // Массив с объектами типа Number, включающий Integer, int, Float, и Double
        Number[] num = {new Integer(1), 11, 1.11f, 11.11};
        
        // Цикл for (1) — перебираем массив, передаем каждый элемент в метод printNum
        for (Number n : num) {
            a.printNum(n);  // В цикле каждый элемент массива имеет тип Number
        }

        // Прямые вызовы (2) — передаем конкретные значения
        a.printNum(new Integer(1));  // Передаем объект Integer, вызывается метод printNum(Integer i)
        a.printNum(11);              // Передаем примитив int, вызывается метод printNum(int i)
        a.printNum(1.11f);           // Передаем примитив float, вызывается метод printNum(Float f)
        a.printNum(11.11);           // Передаем примитив double, вызывается метод printNum(Number n)
    }
}