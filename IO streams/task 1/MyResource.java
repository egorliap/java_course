public class MyResource implements AutoCloseable {

    // Имитация ресурса
    private String resourceName;

    public MyResource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("Ресурс " + resourceName + " открыт.");
    }

    // Метод close, который будет вызываться автоматически
    @Override
    public void close() {
        System.out.println("Ресурс " + resourceName + " закрыт.");
    }

    public void performAction() {
        System.out.println("Ресурс " + resourceName + " выполняет действия.");
    }

    public static void main(String[] args) {
        // try-with-resources для автоматического закрытия ресурса
        try (MyResource resource = new MyResource("Мой файл")) {
            resource.performAction();
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }
}
