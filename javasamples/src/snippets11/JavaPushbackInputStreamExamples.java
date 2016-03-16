package snippets11;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

/**
 * Created by root on 15/3/16.
 */
public class JavaPushbackInputStreamExamples {
    public static void main(String[] args) {
        //example expression you want to evaluate in your program
        String strExpression = "a = a++ + b;";

		/*
		 * Here, while, evaluating the expression, You need to know
		 * whether it is ++ operator or + plus operator. Basically,
		 * you need to read ahead or peek whether another + follows
		 * immediately after one + sign.
		 */

        //get bytes from the expression string
        byte bytes[] = strExpression.getBytes();

        //create stream from expression bytes
        ByteArrayInputStream bis = new ByteArrayInputStream (bytes);

		/*
		 * PushbackInputStream provides below given two constructors.
		 *
		 * 1) PushbackInputStream(InputStream is)
		 * creates PushbackInputStream from provided InputStream object
		 *
		 * 2)PushbackInputStream(InputStream is, int size)
		 * Creates PushbackInputStream from specified InputStream object
		 * with pushback buffer of specified size.
		 */
        //create PushbackInputStream from ByteArrayInputStream
        PushbackInputStream pis = new PushbackInputStream(bis);

        int ch;

        try
        {

            while( (ch = pis.read())!= -1)
            {
                //we encountered first + operator
                if(ch == '+')
                {
                    //peek to see if another + follows
                    if( (ch = pis.read()) == '+')
                    {
                        System.out.print("Plus Plus");
                    }
                    else
                    {
                        //push back one position as we did not get another +
				/* 1) void unread(int b)
				unreads/pushes back single byte by copying it in the front of the buffer. */
                        pis.unread(ch);

                        System.out.print("+");
                    }
                }
                else
                {
                    //print the character
                    System.out.print((char)ch);
                }
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Exception while reading" + ioe);
        }
    }
}
