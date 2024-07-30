import java.util.Scanner;

public class InputTakingCharater
 {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        char a;
        System.out.println("enter any charater");
        a=ob.next().charAt(0);
        System.out.println(a);
        ob.close();
    }
}
