package ThreadDemo;

public class MultithreadDemoRunnable implements Runnable  {


    @Override
    public void run() {
        System.out.println("Thread from Runnable " + Thread.currentThread().getId() + " is running ");
    }

}
