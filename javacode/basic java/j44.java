import java.util.Scanner;

public class j44 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.err.println("how much you want odd number");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        System.out.println(2*i+1);
        sc.close();
    }
    
}
