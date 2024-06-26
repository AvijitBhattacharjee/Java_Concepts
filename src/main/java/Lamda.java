// Copyright (c) avijit bhattacharjee 2024
// lamda only works for functional interface

@FunctionalInterface
interface A {
    public int add(int i, int j);
}

public class Lamda {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j;
        System.out.println(obj.add(5,4));
    }
}
