import java.util.Scanner;

public class j10 {
    public static void main(String[] args) {
        System.out.println("--Your result --");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first marks:");
        int a = sc.nextInt();

        System.out.println("Enter your second marks:");
        int b = sc.nextInt();

        System.out.println("Enter your third marks:");
        int c = sc.nextInt();

        System.out.println("Enter your fourth marks:");
        int d = sc.nextInt();

        System.out.println("Enter your fifth marks:");
        int e = sc.nextInt();

        float total = (a + b + c + d + e) / 5;
        System.out.printf("Your percentage is: %f",total);

        sc.close();

    }

}
