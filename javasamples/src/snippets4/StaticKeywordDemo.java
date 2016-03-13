package snippets4;

/**
 * Created by root on 13/3/16.
 */
public class StaticKeywordDemo {
    static int a=20;
    static int b=13;
    static void callme(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        StaticKeywordDemo.callme();
    }
}
