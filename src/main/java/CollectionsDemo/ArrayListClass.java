package CollectionsDemo;

import java.util.*;

import static java.util.Collections.*;

public class ArrayListClass {



    public static void main(String[] args) {

        ArrayList test = new ArrayList();
        test.add(1);
        test.add("gunjan");
        test.add(344.44f);

        for (int i = 0; i < test.size() ; i++) {
            System.out.println(test.get(i));
        }
        ArrayList<String> colors = new ArrayList<String>();
        //Size 10
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Apple");
        colors.add("Banana");
        colors.add("Grapes");
        colors.add("Pineapple");
        colors.add("Papaya");
        colors.add("Cherry");
        colors.add("Cantaloupe");

        Collections.sort(colors);
        System.out.println(colors );


        Collections.reverse(colors);
        System.out.println(colors );

        Collections.shuffle(colors);
        System.out.println(colors );

        colors.add(2,"Yellow");
        System.out.println("Contains:" + colors.contains("Yellow"));
        System.out.println("Size" + colors.size());
        System.out.println("ArrayList:"+ colors);



        Iterator<String> itr= colors.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        int x = 0;
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            x+= it.next();
        }
        System.out.println(x);

    }
}
