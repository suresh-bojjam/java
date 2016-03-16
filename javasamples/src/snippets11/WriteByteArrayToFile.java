package snippets11;

/**
 * Created by root on 16/3/16.
 */
/*
	Write byte array to file using BufferedOutputStream
	This example shows how to write a byte array to file using
	java BufferedOutputStream.
*/

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

public class WriteByteArrayToFile {

    public static void main(String[] args) {

        String strFileName = "D:\\mutyal\\JavaLab-II Yr-II Sem 2009-2010\\cycle2\\week11\\tmp.txt";
        BufferedOutputStream bos = null;

        try
        {
            //create an object of FileOutputStream
            FileOutputStream fos = new FileOutputStream(new File(strFileName));

            //create an object of BufferedOutputStream
            bos = new BufferedOutputStream(fos);

            String str = "BufferedOutputStream Example";

			/*
			 * To write byte array to file use,
			 * public void write(byte[] b) method of BufferedOutputStream
			 * class.
			 */
            System.out.println("Writing byte array to file");

            bos.write(str.getBytes());

            System.out.println("File written");
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("Error while writing file" + ioe);
        }
        finally
        {
            if(bos != null)
            {
                try
                {

                    //flush the BufferedOutputStream
                    bos.flush();

                    //close the BufferedOutputStream
                    bos.close();

                }
                catch(Exception e){}
            }
        }

    }
}

/*
Output would be
Writing byte array to file
File written

File contents would be
BufferedOutputStream Example
*/