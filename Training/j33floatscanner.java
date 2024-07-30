import java.util.Scanner;

public class j33floatscanner {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        float a;
        System.out.println("Enter a number:");
        a=ob.nextFloat();
        System.out.println(a);
        ob.close();
    }
}
