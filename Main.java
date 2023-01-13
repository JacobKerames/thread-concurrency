public class Main {
    public static void main(String[] args) {
        /* Create two threads, one for counting up and one for
        counting down */
        Thread t1 = new Thread(ThreadConcurrency::countUp);
        Thread t2 = new Thread(ThreadConcurrency::countDown);

        // Start thread one
        t1.start();

        // Wait for thread one to finish
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start thread two
        t2.start();
    }
}