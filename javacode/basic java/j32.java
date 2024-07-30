import java.util.Scanner;

public class j32 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age :");
        try (Scanner sc = new Scanner(System.in)) {
            age = sc.nextInt();
            
            switch (age) {
                case 18 -> System.out.println("you are going to adult");
                    
                case 21 -> System.out.println("you are going to join a job");
                case 60 -> System.out.println("you are going to retire ");
                    
                    
                default -> System.out.println("enjoy you  life");
            }
        }

    }
}
