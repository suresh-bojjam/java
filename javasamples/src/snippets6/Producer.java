package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Producer extends Thread{

    int i=0;
    Entity e;
    public Producer(Entity e) {
        this.e=e;
    }

    @Override
    public void run() {
        while(i<10){
            e.setx(i);
            i=i+1;
        }
    }
}
