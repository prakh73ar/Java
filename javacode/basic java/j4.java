import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        System.out.println("What is your age:");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.printf("The age is :%d", age);
        scanner.close();

    }

}
