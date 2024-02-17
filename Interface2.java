// Copyright (c) avijit bhattacharjee 2024
interface A  extends Y{

    int price = 50;             // variables under interface are always
    String name = "interface";  // static and final  
                               
    void show();
    void config();
}

class B implements A {

    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }

    public void run() {
        System.out.println("in run");
    }
}

interface X {
    void run();
}

interface Y extends X {
    
}

public class Interface2 {
    public static void main(String[] args) {

        A obj;
        obj = new B();
        obj.show();
        obj.config();
        obj.run();
        

        // A.price = 40; // not allowed

        System.out.println(A.name);
        
    }
}
