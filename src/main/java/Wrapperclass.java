// Copyright (c) avijit bhattacharjee 2024

public class Wrapperclass {
    public static void main(String[] args) {
        
        int num = 7;
        Integer num1 = num; // auto boxing

        int num2 = num1; // auto-unboxing

        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
    
}
