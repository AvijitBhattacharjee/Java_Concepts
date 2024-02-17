// Copyright (c) avijit bhattacharjee
// Copyright (c) avijit bhattacharjee
import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("avijit", 123);
        map.put("arijit", 124);
        map.put("abhijit", 125);
        map.put("arijit", 1243);

        System.out.println(map);

        System.out.println(map.keySet());

        for (String name: map.keySet()){
            System.out.println(name + " " + map.get(name));
        }
    }
}
