package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class ThreadA extends Thread {
    
    @Override
    public void run() {
        super.run();
        for(int x=0;x<10;x++){
            System.out.println("ax = " + x);
        }
    }
}
