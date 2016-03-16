package snippets11;

import java.io.*;

/**
 * Created by root on 15/3/16.
 */
public class DataInputStreamExample {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream ( "/home/suresh/coding/tmp/dis.txt" );
            DataInputStream di = new DataInputStream ( System.in );
            BufferedOutputStream bo = new BufferedOutputStream(fout,1024);
            char ch;
            while ((ch=(char)di.read())!='@')
                bo.write ( ch );
            bo.close ();
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }
    }
}
