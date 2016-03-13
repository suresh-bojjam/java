/**
 * Created by root on 11/3/16.
 */

//IF CControl Structure
public class IFCS {
    public static void main(String args[]){
        if(args.length>1){
            System.out.println("One Argument is Enough");
            System.exit(0);
        }else{
            System.out.println("Sufficient Arguments passed");
        }
    }
}
