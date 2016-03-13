package snippets7;

/**
 * Created by root on 13/3/16.
 */
public class StringAppending {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Programming");
        sb.append(" teaches you ").append("how to ").append("think");
        System.out.println(sb.toString());
    }
}
