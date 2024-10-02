/**
 * Boinomial
 */
public class Boinomial {
    public static int boinocoe(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fatc_nmr=factorial(n-r);

        int boinocoe=fact_n /(fact_r*fatc_nmr);
        return boinocoe;
    }

    public static void main(String[] args) {
        System.out.println(boinocoe(5, 2));
    }
}