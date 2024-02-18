// Copyright (c) avijit bhattacharjee 2024
 abstract class Car {

    // method needs to be abstract
    public abstract void drive();

    public abstract void fly();

    public void driver() {
        System.out.println("Driver ...");
    }
}


// class needs to be abstract
abstract class Wagnor extends Car {
    public void drive() {
        System.out.println("Drive ...");
    }
}


class UpdatedWagnor extends Wagnor { // concrete class

    public void fly() {
        System.out.println("FLY ...");
    }
}


public class Abstract {
    public static void main(String[] args) {

        // we can not create object of an abstract class
        // we can create instance of an abstract class
        Car car = new UpdatedWagnor();
        car.drive();     
        car.fly(); 
    }    
}
