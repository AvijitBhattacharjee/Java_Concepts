// Copyright (c) avijit bhattacharjee 2024

@FunctionalInterface
interface A { void show(int i); }

public class Annotations {
    public static void main(String[] args) {
        
        // using lamda
        A obj = i -> System.out.println("in show " + i);
        obj.show(5);
    }
}
