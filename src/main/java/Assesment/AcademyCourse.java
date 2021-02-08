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


 String csvFile = "/users/gunjanpandya/dev/java-algorithm-practice-repo/files/sample-input-4.txt";
 String line = "";
  try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

//String line="";line
//HashSet<String> storeCourseSeq= new LinkedHashSet<String>();
   HashMap<String, ArrayList<String>> storeCourseSeq = new HashMap<String, ArrayList<String>>();
   Set<String> result = new LinkedHashSet<String>();

   while ((line = br.readLine()) != null) {
    String str = line;
// System.out.println(str);
    String[] splitString = str.split(" ");
    if (splitString.length > 1) {
     // storeCourseSeq.put(splitString[0],)
     ArrayList<String> storeTempCourseInfo = new ArrayList<String>();

     for (int i = 1; i < splitString.length; i++) {
      storeTempCourseInfo.add(splitString[i]);
     }
     storeCourseSeq.put(splitString[0], storeTempCourseInfo);

    }

   }

   System.out.println("Size " + storeCourseSeq.size());
  // String i = String.valueOf(storeCourseSeq.size());

   ArrayList<String> keyList = new ArrayList<String>(storeCourseSeq.keySet());

    for(int i = 0 ;i <= storeCourseSeq.size();i++)
    {
     String currentIndex= String.valueOf(i);
     if(!keyList.contains(currentIndex))
     {
      result.add(currentIndex);
     }

    }

   ArrayList<String> valueString = new ArrayList<String>();
for(int j=storeCourseSeq.size()-1 ; j >=0 ; j--) {
 valueString = storeCourseSeq.get(String.valueOf(j));
 for (String str : valueString) {
  result.add(str);
 }

 if(j==0)
 {
  result.add("0");

 }
}
   System.out.println(result);


  }

}
}
