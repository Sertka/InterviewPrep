import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private int count = 0;

    private Lock lock = new ReentrantLock();

    public int inc() {
        try {
            lock.lock();
            this.count++;
            return this.count;
        } finally {
            lock.unlock();
        }
    }

    // Для сравнения - счетчик без блокировки
    public int incWOLock() {
            this.count++;
            return this.count;
    }
}
