interface  X {
    void displayX();
}
interface Y {
    void displayY();
}

class Z implements X,Y{
    public void displayX(){
        System.out.println("Display X");
    }
    public void displayY(){
        System.out.println("Display Y");
    }
}
public class J98interface {
    public static void main(String[] args) {
        Z ob=new Z();
        ob.displayX();
        ob.displayY();
    }
}
