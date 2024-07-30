public class j7 {
    public static int factor(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factor(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(factor(n));
    }
}
