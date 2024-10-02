//parent class
class PAPA{
    void display(){
        System.out.println("This is PAPA class");
    }
}
//child class
class SON extends PAPA{
    void show(){
        System.out.println("This is son class");
    }
}

public class J90singleInheritance {
    public static void main(String[] args) {
        SON raj = new SON();
        raj.display();
        raj.show();
        
    }
    
}
