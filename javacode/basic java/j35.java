import java.util.Scanner;

public class j35 {
    public static void main(String[] args) {
        System.out.println("--Check how much you pay tax :--");
        System.out.println("Enter your slab:");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        if (a<250000) {
            System.out.println("You should not pay tax");

        }
        else if (a>=250000&&a<=500000) {
            System.out.println("you should pay 5% tax");
            
        } 
        else if (a>500000&&a<=1000000) {
            System.out.println("you should pay 20% tax");
            
        } else {
            System.out.println("you should pay 30% tax");
        }

        sc.close();

    }

}
