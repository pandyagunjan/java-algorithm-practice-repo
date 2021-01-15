package OtherSources;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;
public class Mix {



//    Given: an array of numbers as strings, i.e., {"1", "5", "15", "9", "4"}
//    Task: sort the numbers
//    Restriction: the numbers must stay strings - no converting to integers 
//

        public void sort(int[] numbers) {
            int temp;
            for (int i = 0; i < numbers.length; i++) {
                boolean notSwapped = true;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j] && notSwapped) {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                        notSwapped = false;
                    }
                }
            }

        }
//    public void sort(String[] numbers) {
        //        String temp;
//        Boolean sorted = false;
//        for (int i = 0; i < numbers.length; i++) {
//            // sorted = true;
//            for (int j = 0; j < numbers.length - 1; j++) {
//                if (numbers[j].compareTo(numbers[j + 1]) > 0) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                    sorted = false;
//                }
//                if (numbers[j].length() > numbers[j + 1].length()) {
//                    temp = numbers[j];
//                    numbers[j] = numbers[j + 1];
//                    numbers[j + 1] = temp;
//                    sorted = false;
//                }
//            }
//            System.out.println(Arrays.toString(numbers));
//        }








        public static int[] duplicateDeleter(int[] array) {
            HashMap<Integer, Integer> countNumbers = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                if (countNumbers.containsKey(array[i])){
                    countNumbers.put(array[i], countNumbers.get(array[i]+1));
                } else {
                    countNumbers.put(array[i], 1);
                }
            }
            int[] result = new int[countNumbers.size()];
            int j =0;
            for (Integer i: countNumbers.keySet()) {
                result[j] = i;
                j++;
            }
            return result;
        }




        //    input:  String[] ofIntegers:  {“-2”, “6”, “9”, “-5”, “5”, “-3”}
//    output:  int[] sameIntegers {-10, 20}
//    //convert/parse strings into ints
////create answer array(size of 2)
////loop thru array of ints, add based on negative sign
        public Integer[] changeAndAdd(String[] input){
            int combinedNegatives = 0;
            int combinedPositives = 0;
            Integer[] answer = new Integer[2];
            for (int i=0; i<input.length; i++){
                Integer intElem = Integer.parseInt(input[i]);
                if (intElem >= 0){
                    combinedPositives += intElem;
                } else {
                    combinedNegatives += intElem;
                }
            }
            answer[0] = combinedNegatives;
            answer[1] = combinedPositives;
            return answer;
        }



        static long repeatedString(String s, long n) {
            long counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a')
                    counter++;
            }

            long appendCounter = n / s.length(); // multiply this with counter found

            counter = counter * appendCounter;

            return counter;

        }

    }


