import java.util.*;;

public class Timezone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month =sc.nextInt();
        int day = sc.nextInt();
        int hr = sc.nextInt();
        int min = sc.nextInt();

        hr += 5;
        min += 30;
        if (min > 60) {
            hr++;
            min -= 60;
        }
        if (hr > 24) {
            day++;
            hr -= 24;
        }
        if (day>30) {
            month++;
            day-=30;
        }
        System.out.println("Month ="+ month + ", Day =" + day + ", Hr =" + hr + ", Min =" + min);
        sc.close();
    }
}
