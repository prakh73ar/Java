import java.util.Scanner;

public class j14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int [] marks={12,2,3,4,5};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i]==n) {
                System.out.println("found"+" "+i);
               
                
            }
            
        }
        
        sc.close();
    }
}
