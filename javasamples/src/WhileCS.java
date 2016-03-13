/**
 * Created by root on 11/3/16.
 */
public class WhileCS {
        public static void main(String args[]){
            int val=12345;
            int val2=val;
            int reminder;
            int rev=0;
            while(val2>0){
                reminder=val2%10;
                val2=val2/10;
                rev=rev*10+reminder;
            }
            System.out.println("rev: "+rev);
        }
}
