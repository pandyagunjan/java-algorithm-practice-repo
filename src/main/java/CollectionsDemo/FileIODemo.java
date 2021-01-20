package CollectionsDemo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Scanner takes in File object and then we can iterate through it.

public class FileIODemo {
    public static void main(String[ ] args) throws FileNotFoundException {
        File x = new File("/Users/gunjan/Dev/java-algorithm-pratice-repo/src/main/java/test2.txt");
        Scanner sc= new Scanner(x);

        long lenghtOfFile= x.length();

        if(x.exists()) {
            System.out.println(x.getName() +  " file exists!");
            System.out.println(x.length() +  " file size!");
          // x.setWritable(true);
          // x.setExecutable(true);
          // Scanner sc= new Scanner(x);
          // System.out.println(x.setReadOnly() +  " file read!");
          // System.out.println(x.setReadable(false) +  " read only!");
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();

        }
        else {
            System.out.println("The file does not exist");
        }



    }
}
