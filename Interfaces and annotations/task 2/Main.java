public class Main {
    public static void main(String[] args) {
        // 6. Пример работы с аннотацией @BaseAction
        ActionClass actionClass = new ActionClass();
        try {
            // Получаем аннотацию на уровне выполнения
            BaseAction action = actionClass.getClass().getMethod("performAction").getAnnotation(BaseAction.class);
            if (action != null) {
                System.out.println("Description: " + action.description());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        
        // 7. Пример использования @Override
        Car car = new Car();
        car.start(); // Выведет: Car starting...

        // 8. Пример использования @Deprecated
        LegacySystem legacySystem = new LegacySystem();
        legacySystem.oldMethod(); // Выведет предупреждение о депрецированности, но выполнится
        legacySystem.newMethod(); // Выведет: This is the new method.

        // 9. Пример использования @SuppressWarnings
        SuppressWarningsExample example = new SuppressWarningsExample();
        example.useRawTypes(); // Программа выполнится без предупреждений
    }
}
