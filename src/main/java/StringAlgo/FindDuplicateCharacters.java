package StringAlgo;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

    public static void main(String[] args) {
                printDuplicateCharacters("Programming");
    }

    private static void printDuplicateCharacters(String word) {
        char[] characters=word.toCharArray();
        Map<Character,Integer> charMap= new HashMap<Character,Integer>();

        for (Character ch:characters) {

            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        for(Map.Entry<Character,Integer> entry : charMap.entrySet())
        {
            if(entry.getValue()>1)
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());

        }


    }

}
