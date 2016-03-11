/**
 * Created by root on 11/3/16.
 */
public class Fibonacci {
    public static void main(String args[]){
        int a=0,b=1,c=0;
        int limit=8;

        System.out.print("Fibonacci: "+a+","+b);

        for(int i=1;i<limit-1;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(","+c);
        }
    }
}
