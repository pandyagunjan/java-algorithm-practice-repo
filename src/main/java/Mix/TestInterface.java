package Mix;

public interface TestInterface {
    public static final int interfaceVar = 55;

     void methodToDisplay();
     //default method body provided , the  class can decide if needs to be overridden
     default void toBeDisplayedFromInterface()
     {
         System.out.println("HELLO HELLO , DEFAULT interface");
     }
}
