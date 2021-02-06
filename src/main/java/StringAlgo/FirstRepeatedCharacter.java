package StringAlgo;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("Programming"));
    }
//Using HashMap
    public static char firstNonRepeatedCharacter(String word) {
        char[] characters=word.toCharArray();
        Map<Character,Integer> charMap= new HashMap<Character,Integer>();

        for (Character ch:characters) {

            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        for (int i = 0; i < word.length(); i++) {

          char c = word.charAt(i);
          if(charMap.get(c) ==1)
          {
              return c;
        }

        }
//        for(Map.Entry<Character,Integer> entry : charMap.entrySet())
//        {
//            if(entry.getValue()==1)
//             //   System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
//                return entry.getKey();
//        }
        throw new RuntimeException("Undefined behaviour");
    }







}
