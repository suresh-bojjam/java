package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class A extends Thread {

    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("class A:"+i);
        }
    }
}
