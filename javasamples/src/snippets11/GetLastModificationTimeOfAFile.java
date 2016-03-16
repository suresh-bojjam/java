package snippets11;

import java.io.File;
import java.util.Date;

/**
 * Created by root on 15/3/16.
 */
public class GetLastModificationTimeOfAFile {
    public static void main(String[] args) {
        File file=new File("/home/suresh/coding/tmp");
        System.out.println("file.lastModified() = " + new Date(file.lastModified()));
    }
}
