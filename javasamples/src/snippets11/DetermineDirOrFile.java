package snippets11;

import java.io.File;

/**
 * Created by root on 15/3/16.
 */
public class DetermineDirOrFile {
    public static void main(String[] args) {
        File file=new File("/home/suresh/coding/tmp");
        boolean isFile=file.isFile();

            System.out.println("isFile = " + isFile);
        boolean isDirectory=file.isDirectory();
            System.out.println("isDirectory = " + isDirectory);
    }
}
