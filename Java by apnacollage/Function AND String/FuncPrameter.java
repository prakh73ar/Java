import java.util.Scanner;

public class FuncPrameter {
    public static int CalSum(int n1,int n2){ // formal or parameter

        int sum =n1+n2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum =CalSum(a,b); // a,b is arguments or actual paramter
        System.out.println("Sum is : "+sum);
        sc.close();
    }
}
