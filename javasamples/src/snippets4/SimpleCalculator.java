package snippets4;

/**
 * Created by root on 13/3/16.
 */
public class SimpleCalculator implements  Compute{

    @Override
    public int sun(int a, int b) {
        return a+b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public int division(int a, int b) {
        if(b==0){
            System.out.println("infinite");
            System.exit(0);
        }
        return a/b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int square(int a) {
        return a*a;
    }

    @Override
    public int squareRoot(int a) {
        System.out.println(" method not implemented");
        return 0;
    }

    @Override
    public int cube(int a) {
        return a*a*a;
    }

    public static void main(String[] args) {
        SimpleCalculator sc=new SimpleCalculator();
        System.out.println("square of 2 is= " + sc.square(2));
    }
}
