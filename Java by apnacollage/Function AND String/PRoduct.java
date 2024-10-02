public class PRoduct {
    public static int Multiply(int a,int b){
        int product =a*b;
        return product;
    }
    public static void main(String[] args) {
        int prod= Multiply(5, 7);
        System.out.println("a * b : "+prod);
    }
}
