package Mix;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.lwawt.macosx.CSystemTray;

/**
 * This is the way documentation comments are written
 */
public class JavaFundamentals implements TestInterface{

    public static void main(String[] args) {
        //Throws compiler error if a variable is declared but not initialized
       // int i = 0;
        int vacationDays = 0;
        long earthPopulation = 0L;
        boolean done;
        int x;
        //CONSTANTS
        final double CM_PER_INCH;//=8.5;
        // System.out.println(i+vacationDays+earthPopulation);
        CM_PER_INCH=33;
        // CM_PER_INCH=44; Cannot initialize the second time.
        System.out.println(CM_PER_INCH);

        String greeting ="Hello";
        System.out.println(greeting.substring(0,3));

       // s.equals(t)
        System.out.println("Hello".equals(greeting));
        System.out.println("Hello".equalsIgnoreCase("hello"));
        String fruit1 = "apple";
        String fruit3 = "Apple";

        System.out.println(fruit1.equals(fruit3));
        System.out.println(fruit1.equalsIgnoreCase(fruit3));

        String num = "3";
        String num2 = Integer.toString(3);
        System.out.println(num == num2);
        System.out.println(num.equals(num2));
        System.out.println(interfaceVar);

        JavaFundamentals obj= new JavaFundamentals();
        obj.methodToDisplay();
        obj.toBeDisplayedFromInterface();

    }

    @Override
    public void methodToDisplay() {
        System.out.println("Printed from class which implements the interface");
    }
    //OPERATORS + , - , / ,* ,/ ,%
   //Math functions
@Override
    public void toBeDisplayedFromInterface()
{
    System.out.println("FROM CLASS");
}


}
