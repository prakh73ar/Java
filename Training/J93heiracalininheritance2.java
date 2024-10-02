class A{
    void print(){
        System.out.println("hello");
    }
}
class B extends A{
    void display(){
        System.out.println("hi");
    }
}
class C extends A{
    void show(){
        System.out.println("hey");
    }
}
class D extends A{
    void san(){
        System.out.println("good");
    }
}
public class J93heiracalininheritance2 {
    public static void main(String[] args) {
        D sc=new D();
        sc.san();
        sc.print();
    }
}
