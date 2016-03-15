package snippets10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by root on 15/3/16.
 */
public class JavaIteratorExample {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();

        ar.add("One");
        ar.add("Two");
        ar.add("Three");
        ar.add("Four");
        ar.add("Five");

        Iterator it=ar.iterator();
        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    }
}
