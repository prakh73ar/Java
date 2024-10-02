//parent class
class PAPA{
    void display(){
        System.out.println("This is the PAPA class");
    }
}
//Intermediate class
class SON extends PAPA{
    void show(){
        System.out.println("This is SON class");
    }
}
//derived class
class GRANDSON extends SON{
    void print(){
        System.out.println("This is the GRANDSON class");
    }
}
public class J91multilevelinheritence {
    public static void main(String[] args) {
        GRANDSON grandson = new GRANDSON();
        grandson.display();
        grandson.show();
        grandson.print();
        
    }
}
