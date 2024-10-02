import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
        sc.close();

    }

    
}