package CollectionsDemo;

import java.util.*;

public class LinkedListClass {

    public static void main(String[] args) {

        LinkedList<String> nodes = new LinkedList<String>();
        //NO Size , node storing value,next,prev
        // previous of first node pointing to null and last nodes next pointing to null too.
        nodes.add("Red");
        nodes.add("Blue");
        nodes.add("Green");
        nodes.add("Orange");
        nodes.add("Orange");



     Iterator<String> itr= nodes.iterator();
     while(itr.hasNext())
     {
         System.out.println(itr.next());

     }


    }


}
