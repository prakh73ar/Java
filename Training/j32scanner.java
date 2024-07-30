import java.util.Scanner;

public class j32scanner{
    public static void main(String[] args) {
        System.out.println("Enter any no");
        int a;
        Scanner ob=new Scanner(System.in);
        a=ob.nextInt();
        System.out.println(a);
        ob.close();
    }
}