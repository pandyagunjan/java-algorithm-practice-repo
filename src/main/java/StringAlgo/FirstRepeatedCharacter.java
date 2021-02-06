package StringAlgo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("Programming"));
    }
//Using HashMap , it does not store insertion order so we loop through the string again
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

        throw new RuntimeException("Undefined behaviour");
    }

// LinkedHashMap stores the insertion order

    public static char getFirstNonRepeatedChar(String str)
    {
        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
    for (char c : str.toCharArray()) { counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1); }
    for (Map.Entry<Character,Integer> entry : counts.entrySet()) { if (entry.getValue() == 1) { return entry.getKey();
    }
    } throw new RuntimeException("didn't find any non repeated Character"); }






}
