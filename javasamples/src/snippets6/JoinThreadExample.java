package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class JoinThreadExample implements Runnable{

    Thread t;
    public JoinThreadExample(Thread t) {
        this.t = t;
        this.t.start();
    }

    @Override
    public void run() {
        try {
            System.out.println("status = " + t.isAlive());
            t.join();
            System.out.println("status = " + t.isAlive());
        }catch (Exception e){
            System.err.print("Error while thread join");
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread();
        JoinThreadExample obj=new JoinThreadExample(t);
        obj.run();
    }
}
