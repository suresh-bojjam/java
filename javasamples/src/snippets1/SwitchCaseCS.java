package snippets1;

/**
 * Created by root on 11/3/16.
 */
/*Switch case Control Structure*/
public class SwitchCaseCS {
    public static void main(String args[]){
        int trigger=Integer.parseInt(args[0]);
        switch(trigger){
            case 1:
                    System.out.println("One");
                    break;
            case 2: System.out.println("Two");
                    break;
            default:
                    System.out.println("Running Default Case, gonna Exit");
                    break;
        }
    }
}
