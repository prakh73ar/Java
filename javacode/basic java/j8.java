import java.util.Scanner;

public class j8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        float a = sc.nextFloat();
        System.out.println("Enter your number:");
        float b = sc.nextFloat();
        float sum = a + b;

       System.out.printf("the no is %f",sum);


        sc.close();

    }
}
