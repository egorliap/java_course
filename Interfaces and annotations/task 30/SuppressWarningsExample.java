import java.util.*;

public class SuppressWarningsExample {
    @SuppressWarnings("unused") // Подавляем предупреждения о неиспользуемых переменных
    private int unusedVariable = 10;

    @SuppressWarnings("unchecked") // Подавляем предупреждения о небезопасных операциях
    public void useRawTypes() {
        // Пример использования необобщённых типов
        List rawList = new ArrayList(); // Компилятор может предупреждать о небезопасном использовании raw types
        rawList.add("Test");
        String s = (String) rawList.get(0); // Предупреждение о небезопасном приведении типов
    }
}
