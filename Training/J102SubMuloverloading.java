class display{
    void show (int a,int b){
        int sub = a-b;
        System.out.println(sub);    
}
void show (int a,int b, int c){
    int mult = a*b*c;
    System.out.println(mult);
}
}
public class J102SubMuloverloading {
    public static void main(String[] args) {
 display sc=new display();
 sc.show(3,5);
 sc.show(4,5,6);       
    }
}
