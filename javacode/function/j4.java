import java.util.Scanner;

public class j4 {
    public static void printFactor(int n){
        if (n<0) {
            System.out.println("invalid");
        }
        int factor =1;
        for (int i = n; i >=1; i--) {
            factor=factor*i;
        }
        System.out.println(factor);
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactor(n);
        sc.close();
    }
}
