package snippets9.hashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by root on 14/3/16.
 */
public class IterateValuesOfHashMapExample {
    public static void main(String[] args) {
        HashMap hm=new HashMap();

        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        hm.put(5,"Five");
        hm.put(6,6);

        Collection c=hm.values();
        Iterator it=c.iterator();
        
        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }

    }
}
