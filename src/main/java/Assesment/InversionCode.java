package Assesment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
class StringFromFile {
    String name;
    String firstString;
    String secondString;
    String thirdString;
    String FourthString;

    public StringFromFile(String name, String firstString, String secondString, String thirdString, String forthString) {
        this.name=name;
        this.firstString=firstString;
        this.secondString=secondString;
        this.thirdString=thirdString;
        this.FourthString =forthString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstString() {
        return firstString;
    }

    public void setFirstString(String firstString) {
        this.firstString = firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public void setSecondString(String secondString) {
        this.secondString = secondString;
    }

    public String getThirdString() {
        return thirdString;
    }

    public void setThirdString(String thirdString) {
        this.thirdString = thirdString;
    }

    public String getFourthString() {
        return FourthString;
    }

    public void setFourthString(String fourthString) {
        FourthString = fourthString;
    }


}



public class InversionCode {

    public static void main(String[] args) {
        // System.out.println("Hello, World");
        ArrayList<StringFromFile> activities = new ArrayList<>();

        String csvFile = "/users/gunjanpandya/dev/java-algorithm-practice-repo/data1.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
           // br.readLine();

            while ((line = br.readLine()) != null) {
                // split line with comma
                String[] getData = line.split(csvSplitBy);
                String name = getData[0];
                String firstString = getData[1];
                String secondString = getData[2];
                String thirdString = getData[3];
                String forthString = "test";//getData[4];;
                activities.add(new StringFromFile(name, firstString, secondString, thirdString, forthString));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[] stringLength= new int[4];
        for (int i = 0; i < activities.size(); i++) {
            String[] splitByColon= activities.get(i).getName().split(":");
            System.out.println(splitByColon[1]);
            stringLength[0] = splitByColon[1].length();
            System.out.println(activities.get(i).getFirstString());
            stringLength[1] = activities.get(i).getFirstString().length();
            System.out.println(activities.get(i).getSecondString());
            stringLength[2] = activities.get(i).getSecondString().length();
            System.out.println(activities.get(i).getThirdString());
            stringLength[3] = activities.get(i).getThirdString().length();
         //   System.out.println(activities.get(i).getSecondString());

        }

    for(int j = 0 ;j < stringLength.length;j++)
    {
        System.out.println(stringLength[j]);
    }

 int counterOfInversion=0;
    for(int l=0 ;l< 4;l++ )
    {
        for(int m=l+1;m<4;m++)
        {
            if(stringLength[l] > stringLength[m])
                counterOfInversion++;
        }
    }
        System.out.println(counterOfInversion);

    }




}
