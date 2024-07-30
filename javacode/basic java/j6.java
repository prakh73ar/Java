import java.util.Scanner;

public class j6 {
    public static void main(String[] args) {
        System.out.println("The CGPA of MATHS ,SCIENCE,ENGLISH");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you MATHS marks:");
        int maths =sc.nextInt();
        System.out.println("Enter you SCIEMCE marks:");
        int science =sc.nextInt();
        System.out.println("Enter you ENGLISH marks:");
        int english =sc.nextInt();

        float cgpa =(maths+science+english)/3;
        System.out.printf("The CGPA is %f",cgpa);
        sc.close();



        
    }
    
}
