package snippets7;

/**
 * Created by root on 13/3/16.
 */
public class StringAppending2 {
    public static void main(String[] args) {
        String str1="programming";
        String str2=" world";

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        char ch3[]=new char[ch1.length+ch2.length];
        for(int i=0;i<ch1.length;i++){
            ch3[i]=ch1[i];
        }
        
        for (int i=ch1.length,j=0;j<ch2.length;j++,i++){
            ch3[i]=ch2[j];
        }
       for(int i=0;i<ch3.length;i++){
            System.out.print(ch3[i]);
        }
    }
}
