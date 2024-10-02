class Display{
    int show(int a, int b){
        return a+b;
    }
    double show(double a, double b){
        return a+b;
    }
    int show(int a, int b, int c){
        return a+b+c;
    }
}
public class J103overloading3 {
    public static void main(String[] args) {
        Display sc = new Display();
        System.out.println(sc.show(3, 4));
        System.out.println(sc.show(3.4574, 5.7565));
        System.out.println(sc.show(34, 33, 33));
        
    }
}
