class A extends Thread {
    public void run() {

        for (int i=0;i<5;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {

        for (int i=0;i<5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10); 
            } 
            catch (InterruptedException e) { 
                e.printStackTrace();
            }
        }
    }

    public void show() {
        System.out.println("in show");
    }
}

// every thread must have a run() method
// which will run by default if we call the thread.start()
// thread object also has setPriority and getPriority()


public class Threading {
    public static void main(String[] args) {
        
        A obj1 = new A();
        B obj2 = new B();

        

        System.out.println(obj1.getPriority()); // by default priority is 5, 1-10 range
        System.out.println(obj1.getName());     // Thread-0 as it is declared first
        System.out.println(obj2.getId());       // by default 15
        System.out.println(obj1.getClass());    // class A
        System.out.println(obj1.getState());    // NEW


        obj2.show();


        obj1.start();
        obj2.start();

        
    }    
}
