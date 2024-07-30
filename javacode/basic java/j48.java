import java.util.Scanner;

public class j48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year=sc.nextInt();
        if (year%4==0&&year%400!=0) {
            System.out.println("This is my leap");
        } else {
            System.out.println("this is not leap year");
        }
        sc.close();

    }
    
}
