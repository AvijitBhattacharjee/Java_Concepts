// Copyright (c) avijit bhattacharjee 2024
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) throws IOException{

        BufferedReader br = null;
        Scanner sc = null;

        try {
            System.out.println("enter one number");

            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            br = new BufferedReader(inputStreamReader);

            int num = Integer.parseInt(br.readLine());
            System.out.println("This is another number = " + num);


            System.out.println("Enter another number");
            sc = new Scanner(System.in);
            int num2 = sc.nextInt();
            System.out.println("This is another number = " + num2);

        } 
        // finally is used to close all the resources
        // code under finally will execute irrespective of try and catch block
        finally {

            br.close();
            sc.close();
        }

        
        // now we can declare our resource in try () like below example, dont neeed to close it
        // because it extends AutoClose
        // Go to BufferReader -> Reader -> Closable -> AutoClosable
        // do not need any finally block to close the resorce if we declare our resource in this way
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            
            int num3 = Integer.parseInt(bufferedReader.readLine());
            System.out.println(num3);
        }
    }
}
