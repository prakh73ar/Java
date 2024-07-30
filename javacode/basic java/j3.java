import java.util.Scanner;

public class j3 {
    public static void main(String[] args) {
        // taking inputn from user
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 :");
        int a =sc.nextInt();
        System.out.println("Enter a number 2 :");
        int b =sc.nextInt();
        int sum =a+b;
        System.out.println("The sum of these number is:");
        System.out.println(sum);
        sc.close();
    }

}
