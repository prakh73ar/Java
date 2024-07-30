public class j25 {
    public static void main(String[] args) {
        String nonTrimmedString = "    harry    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        String trimmedString = nonTrimmedString.trim();
        System.out.println(nonTrimmedString.trim());
        System.out.println(trimmedString);

    }

}
