package Threads;

/*public class CreateThread implements Runnable {

        public void run() {
            System.out.println("Hello from a thread!");
        }
        public static void main(String args[]) {
            (new Thread(new CreateThread())).start();
        }
    }
    */
public class CreateThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new CreateThread()).start();
    }

}
