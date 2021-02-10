package Mix;

public interface TestInterface {
    public static final int interfaceVar = 55;

     void methodToDisplay();
     default void toBeDisplayedFromInterface()
     {
         System.out.println("HELLO HELLO , DEFAULT interface");
     }
}
