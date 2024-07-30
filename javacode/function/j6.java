public class j6 {
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    // public static int sum(int a, int b, int c,int d) {
    //     return a + b + c+d;
    // }
     public static int sum(int x,int ...arr){
        int result=x;
        for (int a: arr) {
            result +=a;
        }
       return result;
     }
    
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("the sum of 4 and 5 is:"+sum(4, 5));
        System.out.println("the sum of 4 and 5 is:"+sum(4, 5));
        System.out.println("the sum of 4 and 3 and 6 is:"+sum(4,3,6));
        System.out.println("the sum of 4 and 3 and 6 and 8 is:"+sum(4,3,6,8));
    }
}