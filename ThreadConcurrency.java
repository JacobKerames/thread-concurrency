import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadConcurrency {
    // Global variables
    static AtomicInteger counter1 = new AtomicInteger(0); // Atomic integer for thread-safe incrementing
    static AtomicInteger counter2 = new AtomicInteger(20); // Atomic integer for thread-safe decrementing
    static Lock outputLock = new ReentrantLock(); // Lock to synchronize output to the console

    // Increment counter1 to 20
    static void countUp() {
        while (counter1.get() < 20) {
            int temp = counter1.incrementAndGet(); // Increment counter
            outputLock.lock(); // Lock the lock to synchronize output
            System.out.println("Counter 1: " + temp); // Output counter value
            outputLock.unlock();
        }
    }

    // Decrement counter2 to 0
    static void countDown() {
        while (counter2.get() > 0) {
            int temp = counter2.decrementAndGet(); // Decrement counter
            outputLock.lock(); // Lock the lock to synchronize output
            System.out.println("Counter 2: " + temp); // Output counter value
            outputLock.unlock();
        }
    }
}