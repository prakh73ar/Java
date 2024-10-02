import java.util.Scanner;;
public class Checktemp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double temp=sc.nextDouble();
        if (temp>=103.5) {
            System.out.println("fever");
        }
        else{
            System.out.println("no fever");
        }
        sc.close();
    }
}
