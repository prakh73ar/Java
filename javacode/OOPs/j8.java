class Employee1 {
    int id;
    String name;

    public void printDetails() {
        System.out.println("Employee id is " + id + "\n My name is " + name);
    }
}

public class j8 {
    public static void main(String[] args) {
       // System.out.println("yessssssssss");
        Employee1 prakhar = new Employee1();
        Employee1 shikhar = new Employee1();
        prakhar.id = 12;
        prakhar.name = "Prakhar";
        shikhar.id = 23;
        shikhar.name = "Singh";
       // System.out.println(prakhar.id);
       // System.out.println(prakhar.name);
       prakhar.printDetails();
       shikhar.printDetails();
    }
}
