import java.util.*;;
public class Topright {
    public static void main(String[] args) {
        System.out.println("ENter a no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j <=n;j++){
                if(i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println( );
        }
        sc.close();
    }
}
