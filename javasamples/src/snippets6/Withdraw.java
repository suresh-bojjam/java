package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Withdraw implements Runnable{
    Account acc=new Account();
    Withdraw(Account acc){
        this.acc=acc;
    }

    @Override
    public void run() {
        synchronized (acc){
            acc.withdraw();
            acc.enquiry();
        }
    }
}
