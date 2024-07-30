
class Shape {
    public void area() {
        System.out.println("area of shape");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);

    }

}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.13 * r * r);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class j5 {
    public static void main(String[] args) {

    }
}
