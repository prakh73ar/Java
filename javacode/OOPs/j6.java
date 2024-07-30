abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("Aniaml contruct");
    }

    public void eat() {
        System.out.println("eating");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse contruct");
    }
    public void walk() {
        System.out.println("Horse is walking");
    }
}

class Chicken extends Animal {
 
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class j6 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
    }

}
