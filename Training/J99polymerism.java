class Display{
    void show(int a){
        System.out.println("NUMBERS"+a);
    }
    void show(String a){
        System.out.println("String"+a);
    }
}
public class J99polymerism {
    public static void main(String[] args) {
        Display d=new Display();
        d.show(20);
        d.show("hell");
    }
}
