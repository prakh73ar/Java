import java.util.Scanner;

public class j34 {
    public static void main(String[] args) {
        System.out.println("--Enter your marks to cheak you are fail or pass--");
        System.out.println("Enter your maths marks:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your science marks:");
        int b = sc.nextInt();
        System.out.println("Enter your english marks: ");
        int c =sc.nextInt();
        float result=(a+b+c)/3f;
        if (result>=40&&a>33&&b>33&&c>33) {
            System.out.println("You are pass");
        }
        else {
            System.out.println("you are fail");
        }
            
         
            sc.close();
            
        
       

    }

}
