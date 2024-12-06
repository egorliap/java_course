public class Main {
    public static void main(String[] args) {
        int a = 1;
        @SuppressWarnings("unused")
        int i = (a == 1) ? 1 : (a == 2) ? 2 : 3; 
    }
}
