import java.util.Scanner;

public class j5 {
    public static void main(String[] args) {
        System.out.println("The adding of three number :");
        System.out.println("Enter first no:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter second no:");
         
        int b = sc.nextInt();
        System.out.println("Enter third no:");
        
        int c =sc.nextInt();
        
        int sum=a+b+c;
        System.out.printf("The sum is :%d", sum);

        sc.close();

    }

}
