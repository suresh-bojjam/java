package snippets7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 13/3/16.
 */
public class Polindrome {
    public static void main(String[] args) throws Exception{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the First String");
        String str=bf.readLine();
        char c[]=str.toCharArray();
        int len=c.length;
        boolean flag=true;
        for(int i=0;i<len/2;i++){
            if(c[i]!=c[len-1-i]){
                flag=false;
                break;
            }
        }

        if(flag)
            System.out.println("polindrome");
        else
            System.out.println("not a polindrome");

        System.exit(0);

        //-----------------------
        System.out.println("Enter the First String");
        String str1=bf.readLine();
        System.out.println("Enter the Second String");
        String str2=bf.readLine();
        StringBuilder sb=new StringBuilder(str2);
        str2=sb.reverse().toString();
        if(str1.equals(str2)){
            System.out.println("polindrome");
        }else{
            System.out.println("not a polindrome");
        }
    }
}
