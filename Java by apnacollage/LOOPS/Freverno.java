public class Freverno {
    public static void main(String[] args) {
        int n=10899;
        while (n>0) {
            int lastdig=n%10;
            System.out.print(lastdig);
            n=n/10;
        }
    }
}
