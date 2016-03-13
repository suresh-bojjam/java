package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Deposit implements Runnable{

    Account acc=new Account();
    public Deposit(Account acc) {
            this.acc=acc;
    }

    @Override
    public void run() {
        synchronized (acc){
            acc.deposit();
            acc.enquiry();
        }
    }
}
