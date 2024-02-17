// Copyright (c) avijit bhattacharjee
// Copyright (c) avijit bhattacharjee
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection {
    public static void main(String[] args) {
        
        List<Integer> num = new ArrayList<Integer>();


        num.add(5);
        num.add(6);
        num.add(7);
        num.add(5);
        num.add(6);
        num.add(7);

        System.out.println(num.indexOf(6));
        System.out.println(num.get(1));
        System.out.println(num.size());

        System.out.println(num);


        Set<Integer> num2 = new HashSet<Integer>();


        num2.add(5);
        num2.add(6);
        num2.add(7);
        num2.add(5);
        num2.add(6);
        num2.add(7);

        // System.out.println(num2.indexOf(6));
        // System.out.println(num2.get(1));
        System.out.println(num2.size());

        System.out.println(num2);

        Iterator<Integer> values = num2.iterator();

        while(values.hasNext()) {
            System.out.println(values.next());
        }



        Set<Integer> num3 = new TreeSet<Integer>();


        num3.add(5);
        num3.add(6);
        num3.add(7);
        num3.add(5);
        num3.add(6);
        num3.add(7);

        // System.out.println(num3.indexOf(6));
        // System.out.println(num3.get(1));
        System.out.println(num2.size());

        System.out.println(num2);



    }
}
