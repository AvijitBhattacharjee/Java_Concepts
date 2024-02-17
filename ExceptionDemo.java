// Copyright (c) avijit bhattacharjee 2024

class Myexception extends Exception {
    public Myexception(String str) {
        super(str);
    }
}


public class ExceptionDemo {
    public static void main(String[] args) {
        
        int i = 10;
        int j = 20;
        int nums[] = new int[5];
        String str = "avijit";
        

        try {
            System.out.println(i/j);
            System.out.println(nums[2]);
            if (str == "avijit") {
                throw new Myexception("string cant be named after me");
            }
            System.out.println(str.length());
        } 
        catch(ArithmeticException e) {
            System.out.println("Some arithmetic exception" + e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Some array exception" + e);
        }
        // my own exception class
        catch(Myexception e) {
            System.out.println("This is my exception " + e);
        }
        // Exception class should be at the bottom as it is the parent class
        catch(Exception e) {
            System.out.println("Some other exception" + e);
        }

    }
}
