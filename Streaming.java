// Copyright (c) avijit bhattacharjee 2024
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streaming {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,2,5,4,6,8,7,9);

        // nums.forEach(n -> System.out.println(n));

        // streams s1 has the data of nums, any change in stream wont impact s1 stream
        // stream can be used only once
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2==0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println(result);


        // above code segment can be written in this way too
        // there is parallelStream for multi threading 
        int result1 = nums.stream()
            .filter(n -> n%2==0)
            .map(n -> n*2)
            .reduce(0, (c,e) -> c+e);

        System.out.println(result1);

        
    


    }
}
