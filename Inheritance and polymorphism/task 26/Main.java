class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        // Проверка, если объект сравниваем с самим собой
        if (this == obj) {
            return true;
        }
        // Проверка на null
        if (obj == null) {
            return false;
        }
        // Проверка на тип объекта
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Преобразование объекта к нужному типу
        Person other = (Person) obj;
        // Сравнение полей
        return this.name.equals(other.name) && this.age == other.age;
    }

    // Переопределение метода hashCode (рекомендуется при переопределении equals)
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true, одинаковые имя и возраст
        System.out.println(p1.equals(p3)); // false, разные имя и возраст
    }
}
