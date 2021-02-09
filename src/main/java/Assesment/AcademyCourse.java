package Assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class AcademyCourse {
public static void main(String[] args) throws IOException, IOException {
//InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
//Read the file
 String csvFile = "/users/gunjanpandya/dev/java-algorithm-practice-repo/files/sample-input-4.txt";
 String line = "";
  try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
   //hashmap to store the course and its pre-req as ArrayList of String
   HashMap<String, ArrayList<String>> storeCourseSeq = new HashMap<String, ArrayList<String>>();
   //LinkedHashSet to store the final result of the courses to do
   Set<String> result = new LinkedHashSet<String>();

   // First string contains the size , so take it in int counter
   int  sizeOfInput=Integer.valueOf(br.readLine());

   while ((line = br.readLine()) != null) {
    String str = line;
    //Take each string and split it based on "space"
    String[] splitString = str.split(" ");
    if (splitString.length > 1) {
     // Populating the hashmap
     ArrayList<String> storeTempCourseInfo = new ArrayList<String>();
     for (int i = 1; i < splitString.length; i++) {
      storeTempCourseInfo.add(splitString[i]);
     }
     //Collected the respective pre-req course in storeTempCourseInfo in ArrayList and then adding the Key,Value in hashmap
     // '0' as the line read is 0 1 2 -- > 0 being the key and 1,2 the pre-req course #
     storeCourseSeq.put(splitString[0], storeTempCourseInfo);
    }
   }

   System.out.println("Size " + storeCourseSeq.size());
   //Collect the keys in arrayList to check which course does not have pre-req and just add that to the set.
   ArrayList<String> keyList = new ArrayList<String>(storeCourseSeq.keySet());
    for(int i = 0 ;i < sizeOfInput;i++)
    {
     String currentIndex= String.valueOf(i);
     if(!keyList.contains(currentIndex))
     {
      result.add(currentIndex);
     }
    }

  // To store the pre-req for looping to be added in the result
   ArrayList<String> valueString = new ArrayList<String>();
     for (int j = sizeOfInput; j >= 0 && storeCourseSeq.size()!=1 ; j--) {
         valueString = storeCourseSeq.get(String.valueOf(j));
         if (valueString != null ) {
             for (String str : valueString) {
                 result.add(str);
             }
         }
         // for last iteration , we have to just add the last element in set which was not added.
         //hence, traversing through the whole keylist and adding to result hashSet.
         if (j == 0) {
          //   String keytemp= storeCourseSeq.entrySet().stream().findFirst().get().getKey();
           //  result.add(storeCourseSeq.entrySet().stream().findFirst().get().getKey());
             keyList.stream().forEach(str -> result.add(str));
         }
     }
     if(storeCourseSeq.size()==1)
     {
      result.add(storeCourseSeq.entrySet().stream().findFirst().get().getKey());
     }
     System.out.println(result);
  }

}
}
