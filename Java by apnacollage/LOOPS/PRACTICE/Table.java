import java.util.*;;
public class Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "X" + i + "="+n*i);
        }
        sc.close();
    }
}
