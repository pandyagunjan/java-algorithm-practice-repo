package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class ArrayListClass {



    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        //Size 10
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");
        colors.add("Orange");

        colors.add(2,"Yellow");
        System.out.println("Contains:" + colors.contains("Yellow"));
        System.out.println("Size" + colors.size());
        System.out.println("ArrayList:"+ colors);



        LinkedList<String> nodes = new LinkedList<String>();
        //Size 10
        nodes.add("Red");
        nodes.add("Blue");
        nodes.add("Green");
        nodes.add("Orange");
        nodes.add("Orange");



        HashMap<String , Integer> map= new HashMap<String,Integer>();
        //Size 16
        map.put("One" , 1);
        map.put("Two" , 2);
        map.put("Three" , 3);
        map.put("four" , 4);
        map.put("four" , 6);

        System.out.println("Overwrites : " + map.get("four"));
        System.out.println("Contains Key : " + map.containsKey("One"));
        System.out.println("Contains Value : " + map.containsValue(1));
        System.out.println("Not found so NULL : " + map.get(8));



        HashSet<String> set= new HashSet<String>();
        //Size 16 , Internally its a map
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        System.out.println(set);


    }
}
