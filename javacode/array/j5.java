
public class j5 {

    public static void main(String[] args) {
        int[][] flates;
        flates = new int[2][3];
        flates[0][0] = 101;
        flates[0][1] = 102;
        flates[0][2] = 103;
        flates[1][0] = 201;
        flates[1][1] = 202;
        flates[1][2] = 203;
        System.out.println("Printing a 2-D array");
        for (int[] flate : flates) {
            for (int j = 0; j < flate.length; j++) {
                System.out.print(flate[j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
