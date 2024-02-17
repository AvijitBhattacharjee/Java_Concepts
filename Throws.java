

class A {

    // instead of handling the exception here, we are throwing exception
    public void show() throws ClassNotFoundException {
        
        Class.forName("Throwing");
    }    
}


public class Throws {

    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
     
        A a = new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
    }
}
