
// if we use class B extends Thread then we can not extend other class as multiple inhertitence not allowed in java
// thats why we are implementing Runnable 
// in main we are creating threads and assiging the objects

class B implements Runnable {
    public void run() {
        for (int i=0;i<5;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Threading2 {
    public static void main(String[] args) {

        Runnable obj1 = () -> 
            {
                for (int i=0;i<5;i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        Runnable obj2 = () -> 
            {
                for (int i=0;i<5;i++) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // if we want to print hi first.
        t1.setPriority(1);

        t1.start();
        t2.start();

        
    }
}
