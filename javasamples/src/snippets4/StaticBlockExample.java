package snippets4;

/**
 * Created by root on 13/3/16.
 */
public class StaticBlockExample {
    static int a=3;
    static int b;
    int x;

    static{
        b=a*4;
    }

    public static void compute(int x){
        System.out.println("Ans = " + x*a*b);
    }

    public static void main(String[] args) {
        compute(5);
    }
}
