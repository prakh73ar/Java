
class Mythread extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("thread is running ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            i = i + 1;
        }
    }
}

class Mythread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("thread is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
            i = i + 1;
        }
    }
}

public class j61 {
    public static void main(String[] args) {

        Mythread thread1 = new Mythread();
        Mythread1 thread2 = new Mythread1();

        thread1.start();
        thread2.start();

    }

}