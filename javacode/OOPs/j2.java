
class Student {
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("called construt");
    }
}
public class j2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Prakhar";
        s1.age=20;
        s1.printInfo();
    }
    
}
