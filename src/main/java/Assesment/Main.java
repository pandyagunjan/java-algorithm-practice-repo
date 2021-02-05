package Assesment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
 /**
* Iterate through each line of input.
  */
         public static void main(String[] args) throws IOException {
  InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
  BufferedReader in = new BufferedReader(reader);
  String line;
  HashSet<String> storeCourseSeq= new LinkedHashSet<String>();
  while ((line = in.readLine()) != null) {
    String str=line;
// System.out.println(str);
   
   
   String[] splitString= str.split(" ");
   if(splitString.length >1)
   {
    for(int i=splitString.length-1 ;i >= 0;i--) {
     if(!storeCourseSeq.contains(splitString[i]))
     { 
     storeCourseSeq.add(splitString[i]);
     System.out.print(splitString[i] + " ") ;
     }
    }

   }
   
   Iterator itr=storeCourseSeq.iterator();
// while(itr.hasNext())
// {
//  System.out.print(itr.next() +" ");
  //  }
 //  for(int k=0;k<storeCourseSeq.size()-1;k++){
  //  System.out.println(storeCourseSeq.remove(k))  ;
  //  }
//  

  }
 }
}