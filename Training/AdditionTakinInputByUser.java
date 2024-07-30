import java.util.Scanner;
public class AdditionTakinInputByUser
{
    public static void main (String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number");
        a=ob.nextInt();
        System.out.println("Enter the second number");
        b=ob.nextInt();
        c=a+b;
        System.out.println(c);
        ob.close();
    }
}
