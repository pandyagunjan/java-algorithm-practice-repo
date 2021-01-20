package CollectionsDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClassDemo {


    public static void main(String[] args) {

        HashSet<String> set= new HashSet<String>();
        //Size 16 , Internally its a map
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        System.out.println(set);


        Iterator<String> itr= set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }

    }
}
