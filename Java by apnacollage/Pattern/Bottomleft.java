import java.util.*;
public class Bottomleft {
    public static void main(String[] args) {
        System.out.println("Enter a no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n; j++) {
                if (i>=j) {
                    System.out.print("* ");
                }
            }
            System.out.println( );
        }
        sc.close();
    }
}
