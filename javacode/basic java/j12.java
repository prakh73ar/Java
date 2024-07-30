import java.util.Scanner;

public class j12 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the km :");
    float a =sc.nextFloat();
    double miles= a*1.609344;
    System.out.println(miles);

    sc.close();
}

}
