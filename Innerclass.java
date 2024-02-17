class A {
    public void show() {
        System.out.println("In show ...");
    }

    // static can be used only for inner class
    static class B {
        public void insideshow() {
            System.out.println("Inside show B...");
        }
    }
}


public class Innerclass {
    public static void main(String[] args) {
        
        A a = new A(){
            public void show() {
                System.out.println("Anynomous class example");
            }
        };
        a.show();

        A.B b = new A.B();
        b.insideshow();

    }
    
}
