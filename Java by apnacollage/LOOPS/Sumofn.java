import java.util.Scanner;

public class Sumofn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=1;
        int sum=0;
        while (n<=m) {
            sum=sum+n;
            n++;
        }
        System.out.println(sum);
        sc.close();
    }
}
