
package StringAlgo;

import java.sql.SQLOutput;
import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        String firstParam = "pot";
        String secondParam = "top";
      // boolean result = checkAnagram(firstParam,secondParam);
     //   boolean result = IsAnagramUsingFor(firstParam, secondParam);
        boolean result = angramCheckUsingIndexOf(firstParam, secondParam);
        if (result)
            System.out.println("The 2 words are ANAGRAM");
        else
            System.out.println("The 2 words are not anagram");
    }

    static boolean checkAnagram(String first, String second) {

        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);
        return Arrays.equals(firstString, secondString);
    }

    //Second method using for loop and checking if letter in first char array is present in other or not
    static boolean IsAnagramUsingFor(String first, String second) {
        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();
        if (firstString.length != secondString.length)
            return false;
        int counter = 0;
        for (int i = 0; i < firstString.length; i++) {
            for (int j = 0; j < secondString.length; j++) {
                if (firstString[i] == secondString[j])
                    counter++;
            }
        }
        return (counter == firstString.length);
    }

    //Index of
    static boolean angramCheckUsingIndexOf(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1);
            } else {
                return false;
            }
        }
        return anagram.isEmpty();

    }
}