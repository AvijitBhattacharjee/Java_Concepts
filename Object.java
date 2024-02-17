// toString, hashmap, equals concept

class Laptop {
    String model;
    int price;

    public String toString() {
        return model + " " + price;
    }

    public boolean equals(Laptop that) {
        return (this.model.equals(that.model) && this.price == that.price); 
    }

    // below methods generated via IDE from right click -> source action -> generate toString, hashCode, equals

    // @Override
    // public String toString() {
    //     return "Laptop [model=" + model + ", price=" + price + "]";
    // }

    // @Override
    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((model == null) ? 0 : model.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }

    // @Override
    // public boolean equals(java.lang.Object obj) {
    //     if (this == obj)
    //         return true;
    //     if (obj == null)
    //         return false;
    //     if (getClass() != obj.getClass())
    //         return false;
    //     Laptop other = (Laptop) obj;
    //     if (model == null) {
    //         if (other.model != null)
    //             return false;
    //     } else if (!model.equals(other.model))
    //         return false;
    //     if (price != other.price)
    //         return false;
    //     return true;
    // } 

}


public class Object {
    public static void main(String[] args) {
        

        Laptop laptop1 = new Laptop();
        laptop1.model = "lenovo";
        laptop1.price = 50000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "lenovo";
        laptop2.price = 50000;


        // by default it will toString method of Object class which gets inherited by default
        System.out.println(laptop1);
        System.out.println(laptop1.toString());

        // it will compare hascode from toString method, defining own equals method
        boolean bool = (laptop1.equals(laptop2));
        System.out.println(bool);
    }
}