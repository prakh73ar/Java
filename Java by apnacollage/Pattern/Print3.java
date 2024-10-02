import java.util.Scanner;

public class Print3 {
    public static void main(String[] args) {
        System.out.println("Enter a no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i>=j) {
                    System.out.print(i);
                }
            }
            System.out.println( );
        }
        sc.close();
    
    }
}
