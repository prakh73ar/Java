import java.util.Scanner;

public class j35check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any no.:=");
        int n=sc.nextInt();
        if (n>0) {
            System.out.println("Number is positive");
        }
        else{
            System.out.println("no is not positive");
        }
        sc.close();
    }
}
 