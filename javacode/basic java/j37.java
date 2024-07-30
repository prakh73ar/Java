import java.util.Scanner;

public class j37 {
    public static void main(String[] args) {
        
        System.out.println("Enter the end of website");
        Scanner sc=new Scanner(System.in);
        String name =sc.nextLine();
         System.out.println(name);
       if (name.endsWith(".org")) {
        System.out.println("This is a organizational websites");
        
       }
       else if (name.endsWith(".com")) {
        System.out.println("This is a commercial websites");
        
       }
       else if (name.endsWith(".in")) {
        System.out.println("This is a indian websites");
        
       }
       else{
        System.out.println("enter right  url of ");
       }
        sc.close();
    }
    
}
