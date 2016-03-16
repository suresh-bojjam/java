package snippets11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 15/3/16.
 */
public class BuffReader {
    public static void main(String[] args)throws Exception {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        System.out.println("bf.readLine() = " + bf.readLine());
    }
}
