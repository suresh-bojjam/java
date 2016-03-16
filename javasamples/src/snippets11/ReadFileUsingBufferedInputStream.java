package snippets11;

import java.io.*;

/**
 * Created by root on 15/3/16.
 */

/*
	Read File Using Java BufferedInputStream Example.
	This example shows how to read a file using available and read
	methods of Java BufferedInputStream.
*/
public class ReadFileUsingBufferedInputStream {
    public static void main(String[] args) {
        File file=null;
        FileInputStream in=null;
        BufferedInputStream bf=null;

        try {
            file=new File("/home/suresh/temp/testjava.txt");
            in=new FileInputStream ( file );
            bf=new BufferedInputStream ( in );

            /*
			 * BufferedInputStream has ability to buffer input into
			 * internal buffer array.
			 *
			 * available() method returns number of bytes that can be
			 * read from underlying stream without blocking.
			 */

            //read file using BufferedInputStream
            while (bf.available ()>0){
                System.out.print((char)bf.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace ( );
        } catch (IOException e) {
            e.printStackTrace ( );
        }finally {
            //close the BufferedInputStream using close method
            try{
                if(bf != null)
                    bf.close();

            }catch(IOException ioe)
            {
                System.out.println("Error while closing the stream : " + ioe);
            }
        }
    }
}
