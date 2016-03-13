package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class ThreadPriority {
    public static void main(String[] args) {
        ThreadA a=new ThreadA();
        ThreadB b=new ThreadB();
        ThreadC c=new ThreadC();
        a.setPriority(Thread.MAX_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        a.setPriority(Thread.NORM_PRIORITY);
        a.start();
        b.start();
        c.start();
    }
}
