# Практика #1
## Приведите примеры использования методы decode().


# Практика #2
## Приведите все способы создания экземпляра класса Boolean.


# Практика #3
## В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример. 

Автоупаковка (boxing):
Если значение null, то объект оболочки также становится null. Исключение не возникает.

Автораспаковка (unboxing):
Если объект оболочки равен null, попытка преобразовать его в примитивный тип (int, float и т.д.) вызывает NullPointerException, так как примитивы не могут быть null.

# Практика #4
## Какие значения напечатает следующий код? Объясните полученный результат. Для чего используется класс IntegerCache?

```
int i1 = 128;
Integer a1 = i1;
Integer b1 = i1;
System.out.println("a1==i1 " + (a1 == i1));
System.out.println("b1==i1 " + (b1 == i1));
System.out.println("a1==b1 " + (a1 == b1));
System.out.println("a1.equals(i1) -> " + a1.equals(i1));
System.out.println("b1.equals(i1) -> " + b1.equals(i1));
System.out.println("a1.equals(b1) -> " + a1.equals(b1));

int i2 = 127;
Integer a2 = i2;
Integer b2 = i2;
System.out.println("a2==i2 " + (a2 == i2));
System.out.println("b2==i2 " + (b2 == i2));
System.out.println("a2==b2 " + (a2 == b2));
System.out.println("a2.equals(i2) -> " + a2.equals(i2));
System.out.println("b2.equals(i2) -> " + b2.equals(i2));
System.out.println("a2.equals(b2) -> " + a2.equals(b2));
```

IntegerCache — это внутренний механизм в классе Integer, который кеширует значения Integer в диапазоне от -128 до 127. Если значение попадает в этот диапазон, объект Integer повторно используется из кеша, чтобы экономить память и улучшать производительность.