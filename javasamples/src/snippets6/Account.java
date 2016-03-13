package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Account {
    int bal=10000;
    int deposit_amount=200;
    int withdraw_amount=100;

    void deposit(){
            bal+=deposit_amount;
    }

    void withdraw(){
            if(bal>=withdraw_amount){
                bal-=withdraw_amount;
            }
    }

    void enquiry(){
        System.out.println("bal = " + bal);
    }
}
