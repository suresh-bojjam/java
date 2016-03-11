package snippets1;

/**
 * Created by root on 11/3/16.
 */
public class Factorial {
    public static void main(String args[]){
        int n=5;
        int factorial=1;
        for(int i=n;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of "+n+":"+factorial);
    }
}
