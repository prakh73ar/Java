public class j18 {
    public static void main(String[] args) {
        int l=0;
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = Math.floorDiv(l,2);
        int temp;
        for (int i = 0; i < n; i++) {
            // |3| |4|
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l = i - 1] = temp;

        }
        for (int element : arr) {
            System.out.println(element);
        }

    }
}
