package CollectionsDemo;

import java.util.*;

public class HashMapClassDemo {


    public static void main(String[] args) {
        HashMap<String , Integer> map= new HashMap<String,Integer>();
        //Size 16
        map.put("One" , 1);
        map.put("Two" , 2);
        map.put("Three" , 3);
        map.put("four" , 4);
      //  map.put("four" , 6);

        System.out.println("Overwrites : " + map.get("four"));
        System.out.println("Contains Key : " + map.containsKey("One"));
        System.out.println("Contains Value : " + map.containsValue(1));
        System.out.println("Not found so NULL : " + map.get(8));


      for(Map.Entry<String,Integer> test : map.entrySet())
      {
          System.out.println(test.getKey());
          System.out.println(test.getValue());
      }

    }
}
