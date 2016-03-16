package snippets11;

import java.io.ByteArrayInputStream;

/**
 * Created by root on 15/3/16.
 */
public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        String string="Programming World...";
        byte[] bytes=string.getBytes();

        ByteArrayInputStream ba=new ByteArrayInputStream(bytes);
        int ch;
        while((ch=ba.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
