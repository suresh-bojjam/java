package snippets5;

/**
 * Created by root on 13/3/16.
 */
public class SB extends SA {
    int i;
    SB(int a,int b)
    {
        super.i=a;i=b;System.out.println("sub class ");
    }

    void display()
    {
        super.display();
        System.out.println("sub i="+i);
    }

}
