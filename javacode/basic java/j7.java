import java.util.Scanner;

public class j7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name");
        String str =sc.next();
        System.out.printf("Hey %s have a good day ",str);
        sc.close();
    }
    
}
