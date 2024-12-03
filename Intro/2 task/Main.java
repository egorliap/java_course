import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.next();

        System.out.printf("Привет, %s \n", name);
        scan.close(); 
    }
}
