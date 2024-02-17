
enum Status {
    Running, Failed, Stopped, Completed
}

enum Laptop {

    // Asus will take the defaulr constructor
    // rest of them will use the parametrized constructor
    Mac(2000), Lenovo(1000), HP(1500), Asus();

    private int price;

    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

public class Enum {
    public static void main(String[] args) {
        
        // first example
        Status s1 = Status.Completed;
        System.out.println(s1);

        Status s2 = Status.Running;
        System.out.println(s2.ordinal());


        Status[] ss = Status.values();

        for (Status s : ss) {
            System.out.println(s + " : " + s.ordinal());
        }


        // second example
        for (Laptop lp : Laptop.values()) {
            System.out.println(lp + " : " + lp.getPrice());
        }


    }
}
