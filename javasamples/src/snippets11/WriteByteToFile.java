package snippets11;

/**
 * Created by root on 16/3/16.
 */
/*
	Write byte to file using BufferedOutputStream
	This example shows to write a byte to file using Java
	BufferedOutputStream. BufferedOutputStream buffers the output so
	that the appication does not have to call underlying output stream
	each time the byte is written.
*/

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteToFile {

    public static void main(String[] args) {

        String strFile = "D:/mutyal/JavaLab-II Yr-II Sem 2009-2010/cycle2/week11/tmp1.txt";
        BufferedOutputStream bos = null;

        try
        {
            //Create FileOutputStream for the file
            FileOutputStream fos = new FileOutputStream(strFile);

            //Create BufferedOutputStream object for FileOutputStream
            bos = new BufferedOutputStream(fos);

            byte b = 66;

			/*
			 * To write a byte to BufferedOutputStream use,
			 * public void write(int b) method of BufferedOutputStream
			 * class.
			 *
			 * This method may throw IOException if something goes
			 * wrong.
			 */

            System.out.println("BufferedOutputStream: writing file");

            //this will write a character represented by ascii 66
            //i.e. 'B'
            bos.write(b);

            System.out.println("BufferedOutputStream : written file");
        }
        catch(FileNotFoundException fnfe)
        {
            System.out.println("Specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("Error while writing to file" + ioe);
        }
        finally
        {
            try
            {
                if(bos != null)
                {
                    bos.flush();
                    bos.close();
                }

            }
            catch(Exception e){}

        }

    }
}

/*
Output would be
BufferedOutputStream: writing file
BufferedOutputStream: written file

File content would be
B
*/