public class SampleThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        SampleThread thread = new SampleThread();
        thread.start();
    }
}
