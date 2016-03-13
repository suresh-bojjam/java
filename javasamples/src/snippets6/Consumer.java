package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class Consumer extends  Thread{

    int i=0;
    Entity e;
    public Consumer(Entity e) {
        this.e=e;
    }

    @Override
    public void run() {
        while(i<10){
            e.getx();
            i=i+1;
        }
    }
}
