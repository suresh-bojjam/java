package snippets6;

/**
 * Created by root on 13/3/16.
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        Entity e=new Entity();
        Producer p=new Producer(e);
        Consumer c=new Consumer(e);
        p.start();
        c.start();
    }
}
