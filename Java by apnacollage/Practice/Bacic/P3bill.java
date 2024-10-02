import java.util.Scanner;

public class P3bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a price of pencil");
        int pencil=sc.nextInt();
        System.out.println("Enter a price of pen");
        int pen =sc.nextInt();
        System.out.println("Enter a price of eraser");
        int eraser=sc.nextInt();
        int total=pencil+pen+eraser;
        float bill=(total*0.18f)+total; //adding 18% gst
        System.out.println("your bill is after adding 18% gst is: "+bill);
        sc.close();
    }
}
