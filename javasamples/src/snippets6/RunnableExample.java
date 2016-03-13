package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class RunnableExample implements Runnable{
    public RunnableExample() {
    }

    @Override
    public void run() {
            for(int x=0;x<10;x++){
                System.out.println("x = " + x);
            }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new RunnableExample());
        t.start();
    }
}

