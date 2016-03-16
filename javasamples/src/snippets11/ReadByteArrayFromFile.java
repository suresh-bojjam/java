package snippets11;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by root on 15/3/16.
 */
public class ReadByteArrayFromFile {
    public static void main(String[] args) {
        String path="/home/suresh/Desktop/test.txt";

        try {
            FileInputStream fin=new FileInputStream (path );
            DataInputStream din=new DataInputStream ( fin );

            int c;
            byte b[]=new byte[10];
            c=din.read(b);

            System.out.println ( "c = " + c +"string: "+b.toString ());

            din.close ();

        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
