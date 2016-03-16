package snippets11;

import java.io.File;

/**
 * Created by root on 15/3/16.
 */
public class CreateDirectory {
    public static void main(String[] args) {
        File f=new File("/home/suresh/coding/tmp/sample.txt");

        if(!f.exists()){
            if(f.mkdir()){
                System.out.println("Existed");
            }else{
                System.out.println("Not Existed");
            }
        }
    }
}
