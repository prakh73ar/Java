
class Display{
    void  show(int a, int b){
        int Sum = a+b;
     System.out.println(Sum);
    }

    void show(int a, int b, int c){
        int Sum = a+b+c;
        System.out.println(Sum);
    }
}
public class J101Addoverloading {
    public static void main(String[] args) {
        Display sc = new Display();
        sc.show(2, 4);
        sc.show(22, 22, 22);
        
    }
}
