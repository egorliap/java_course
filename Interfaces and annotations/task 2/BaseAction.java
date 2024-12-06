import java.lang.annotation.*;

@Target(ElementType.METHOD) // Указывает, что аннотация применяется к методам
@Retention(RetentionPolicy.RUNTIME) // Указывает, что аннотация доступна во время выполнения
public @interface BaseAction {
    String description(); // Метод-член, который должен быть задан при использовании аннотации
}
