package snippets11;

import java.io.*;

/**
 * Created by root on 15/3/16.
 */
public class ReadFileInToString {
    public static void main(String[] args) {
        BufferedInputStream bin=null;
        FileInputStream fin;
        try {
            File file=new File ("/home/suresh/temp/testjava.txt");
            fin=new FileInputStream (file);
            bin=new BufferedInputStream ( fin);

            byte[] contents=new byte[1024];

            int bytesRead=0;
            String strFileContents;

            while ((bytesRead=bin.read (contents))!=-1){
                strFileContents = new String(contents, 0, bytesRead);
                System.out.print(strFileContents);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace ( );

        } catch (IOException e) {
            e.printStackTrace ( );
        }finally {
            try{
                if(bin != null)
                    bin.close();
            }catch (Exception e){

            }
        }
    }
}
