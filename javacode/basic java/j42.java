import java.util.Scanner;

public class j42 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("How much print");
        int n=sc.nextInt();
        int i=1;
        do {
            System.err.println(i);
            i++;
        } while (i<=n);
        sc.close();

    }
    
}
