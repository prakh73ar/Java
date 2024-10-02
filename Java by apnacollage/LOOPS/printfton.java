import java.util.*;;
public class printfton {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int m=sc.nextInt();
        while (n<=m) {
            System.out.println(n);
            n++;
        }
        sc.close();
    }
}
