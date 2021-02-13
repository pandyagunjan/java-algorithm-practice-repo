package ThreadDemo;

public class Multithread {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        //Using the extended class
       // System.out.println("Using the extended class");
        for (int i=0; i<n; i++)
        {
            MultithreadingDemo object = new MultithreadingDemo();
            object.start();
        }

        //Using the implemented interface class
      //  System.out.println("Using the implemented interface class");
        for (int i=0; i<n; i++)
        {
            Thread threadObj = new Thread(new MultithreadDemoRunnable());
            threadObj.start();
        }
    }
}
