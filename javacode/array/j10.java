import java.util.Scanner;

public class j10 {
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows =sc.nextInt();
        int cols =sc.nextInt();

        System.out.println("Input");

        int[][] number=new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j]=sc.nextInt();
            }
        }
        int x =sc.nextInt();


        System.out.println("output");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (number[i][j]==x) {
                    System.out.printf("found at location ("+i+","+j+")");
                    
                }
            }
        }
        sc.close();

    }
}
