import java.util.Scanner;

public class J10typeconv {
    public static void main(String[] args) {
        // int a=5;
        // long b=a;
        // System.out.println(b);
        // long a=25; not possible
        // int b=a;
        // byte->short->int->float->long->double
        Scanner sc=new Scanner(System.in);
      //  int n=sc.nextFloat(); not possible
        float n=sc.nextInt();
        System.out.println(n);
        sc.close();
        
    }
}
