public class J104PublicExample {
    public int number = 10;
    public void display(){
        System.out.println("Public method");
    }
}
class Main{
    public static void main(String[] args) {
        J104PublicExample obj = new J104PublicExample();
        obj.display();
        System.out.println(obj.number);
        
    }
}
