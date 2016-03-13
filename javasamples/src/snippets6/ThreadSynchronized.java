package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class ThreadSynchronized {

    public static void main(String[] args) {
        Account acc=new Account();
        Thread t1=new Thread(new Deposit(acc));
        Thread t2=new Thread(new Withdraw(acc));
        t1.start();
        t2.start();
    }
}
