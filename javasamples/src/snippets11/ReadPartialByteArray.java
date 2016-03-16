package snippets11;

/**
 * Created by root on 16/3/16.
 */
/*
	Read partial byte array using ByteArrayInputStream Example
	This example shows how to create ByteArrayInputStream from
	partial array of bytes using offset and legth arguments of
	ByteArrayInputStream constructor.

	Method of this class can be called even after calling the close method
	without causing the IOException. Closing ByteArrayInputStream has
	no effect.

*/

import java.io.ByteArrayInputStream;

public class ReadPartialByteArray {

    public static void main(String[] args) {

        String str = "Byte Array InputStream Example";

        //get bytes from string
        byte[] bytes = str.getBytes();

		/*use below given constructor of ByteArrayInputStream to
		 * create stream of partial byte array,
		 *
		 * ByteArrayInputStream(byte[] b, int offset, int length)
		 */

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes, 5, 5);
        int ch;

        while ((ch = bis.read()) != -1)
        {
            System.out.print((char)ch);
        }

    }
}

/*
Output of this program would be
Array
*/