package CollectionsDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

//Scanner takes in File object and then we can iterate through it.
//Formatter - Used to write in files

public class FileIODemo {
    public static void main(String[ ] args) throws FileNotFoundException {
        File x = new File("/Users/gunjan/Dev/java-algorithm-pratice-repo/src/main/java/test2.txt");


        long lenghtOfFile= x.length();

        if(x.exists()) {
            System.out.println(x.getName() +  " file exists!");
            System.out.println(x.length() +  " file size!");

          // x.setWritable(true);
          // x.setExecutable(true);
          // System.out.println(x.setReadOnly() +  " file read!");
          // System.out.println(x.setReadable(false) +  " read only!");

            Scanner sc= new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();

        }
        else {
            System.out.println("The file does not exist");
        }
        Formatter f = new Formatter("/Users/gunjan/Dev/java-algorithm-pratice-repo/src/main/java/test3.txt");
        f.format("%s %s %s", "1" , "John" , "Smith \r\n");
        f.format("%s %s %s", "2" ,"Amy", "Brown \r\n");
        f.close();

    }
}
