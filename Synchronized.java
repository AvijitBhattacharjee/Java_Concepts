
class Counter {
    int count;
    public synchronized void increament() {
        count++;
    }
}

// two threads sharing one class object variable
// making the shared thing synchronized

public class Synchronized {
    public static void main(String[] args) {
        
        Counter counter = new Counter();

        Runnable obj1 = () -> {
          for(int i=0;i<5;i++) {
            counter.increament();
          }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<5;i++) {
              counter.increament();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        // join works like first thread 1 will complete and it will join main() thread to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.count);
    }
}
