package snippets1;

/**
 * Created by root on 11/3/16.
 */

public class CmdLineArguments {
    public static void main(String args[]){
        if(args.length==0){
            System.out.println("Insufficient Arguments..");
            System.exit(0);
        }
        String arg1=args[1];
        String arg2=args[2];

/*
        if(org.apache.commons.lang3.StringUtils.isEmpty(arg1)){
            System.out.println("Insufficient Arguments..");
        }

        if(org.apache.commons.lang3.StringUtils.isEmpty(arg2)){
            System.out.println("Insufficient Arguments..");
        }
*/

     System.out.print("sum="+Integer.parseInt(arg1)+Integer.parseInt(arg2));

    }
}