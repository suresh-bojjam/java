package snippets7;
import  java.util.StringTokenizer;
/**
 * Created by root on 14/3/16.
 */
public class StringTokenizerDelimiter {
    public static void main(String[] args) {
        StringTokenizer std=new StringTokenizer("program|software","|");
        while (std.hasMoreElements()){
            System.out.println("std.nextToken() = " + std.nextToken());
        }
    }
}
