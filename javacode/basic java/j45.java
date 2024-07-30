import java.util.Scanner;

public class j45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how much you print reverse number ");
        int n=sc.nextInt();
        for (int i=1; i>=-n; i--)
        System.out.println(i);
        sc.close();
    }
    
}
