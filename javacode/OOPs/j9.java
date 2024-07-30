class Employee {
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;

    }

    public void setName(String n) {
        name = n;

    }
}

public class j9 {
    public static void main(String[] args) {
        Employee prakhar = new Employee();
        prakhar.setName("Prakhar");
        System.out.println(prakhar.getName());
    }
}
