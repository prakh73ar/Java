
public class j4 {

    public static void main(String[] args) {

        int[] marks = {98, 87, 86, 56, 55};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);

        }
        System.out.println("hii");
        for (int element : marks) {
            System.out.println(element);
        }
    }
}
