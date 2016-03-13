package snippets7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 13/3/16.
 */
public class ReversingAString {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String");
        String str = bf.readLine();
        char c[] = str.toCharArray();
        int len = c.length;
        boolean flag = true;
        char temp;
        for (int i = 0; i < len / 2; i++) {
            if (c[i] != c[len - 1 - i]) {
                temp=c[i];
                c[i]= c[len-1-i];
                c[len-1-i]=temp;
                flag = false;
            }
        }

        if (flag){
            System.out.println("polindrome");
        }else{
            System.out.println(new String(c));
        }
    }
}
