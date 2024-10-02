//method overloading

class Display{
    void show(int a){
        System.out.println("Number: " + a);
    }
    void show(String a){
        System.out.println("Name: " +a);
    }
    
}
public class J100Overloading {
    public static void main(String[] args) {
        Display sc = new Display();
        sc.show(65);
        sc.show("Vaibhav");
       // sc.show(3, 4, 7);
    }
}

