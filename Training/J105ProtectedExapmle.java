public class J105ProtectedExapmle {
    protected int n = 10;

    protected  void display(){
        System.out.println("Protected method");
    }
}
    class Subclass extends J105ProtectedExapmle{
        void show(){
            System.out.println(n);
            display();
        }
    }
    
 class Main{
    public static void main(String[] args) {
        Subclass sc = new Subclass();
        sc.show();
        
   
        
    }
}
