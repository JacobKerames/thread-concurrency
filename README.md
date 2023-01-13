# Thread Concurrency

This program demonstrates the use of threads and concurrency in Java. It creates two threads, one that counts up to 20 and another that counts down to 0. The program uses `java.util.concurrent.atomic.AtomicInteger` for thread-safe incrementing and decrementing of the counters, and `java.util.concurrent.locks.ReentrantLock` for synchronizing output to the console.

## How it works

The `Main` class contains the `main` method, where two threads are created and started. The first thread, `t1`, runs the `countUp` method, which increments an `AtomicInteger` called `counter1` until it reaches 20. The second thread, `t2`, runs the `countDown` method, which decrements an `AtomicInteger` called `counter2` until it reaches 0.

The `countUp` and `countDown` methods use the `incrementAndGet` and `decrementAndGet` methods respectively, provided by `AtomicInteger`, to increment and decrement the counters in a thread-safe manner.

The program also uses a `ReentrantLock` to synchronize output to the console, to prevent multiple threads from writing to the console at the same time. The `outputLock` is locked before outputting the current value of the counters, and unlocked immediately after.

The `main` method also uses the `join()` method to wait for the first thread to finish before starting the second thread, to ensure that the second thread does not start until the first thread has completed.
