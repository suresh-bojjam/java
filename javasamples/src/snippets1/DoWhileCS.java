package snippets1;

/**
 * Created by root on 11/3/16.
 */
public class DoWhileCS {
    public static void main(String args[]){
        int val=12345;
        int val2=val;
        int reminder;
        int rev=0;
        do{
            reminder=val2%10;
            val2=val2/10;
            rev=rev*10+reminder;
        }while(val2>0);
        System.out.println("rev: "+rev);
    }
}
