import java.util.Scanner;

public class Continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        do {
            System.out.println("Enter your no :");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}
