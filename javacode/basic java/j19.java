import java.util.Scanner;

public class j19 {
    public static void main(String[] args) {
        System.out.println("Enter the value of u :");
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        System.out.println("Enter the value of v :");
        int v = sc.nextInt();

        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the value of  :");
        int s = sc.nextInt();

        float b = (u * u - v * v) / (2 * a * s);
        System.out.println(b);
        sc.close();

    }

}
