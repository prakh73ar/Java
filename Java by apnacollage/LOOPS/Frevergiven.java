/**
 * Frevergiven
 */
public class Frevergiven {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        int lastdig;
        while (n > 0) {
            lastdig = n % 10;
            rev = (rev * 10) + lastdig;
            n=n/10;

        }
        System.out.println(rev);
    }

}