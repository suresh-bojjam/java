package snippets7;

/**
 * Created by root on 14/3/16.
 */
public class SubStringCons {
    public static void main(String args[])
    {
        byte ascii[] = {73, 78, 68 ,73,65};
        String s1 = new String(ascii);
        System.out.println(s1);
        String s2 = new String(ascii, 0, 4);
        System.out.println(s2);
    }
}
