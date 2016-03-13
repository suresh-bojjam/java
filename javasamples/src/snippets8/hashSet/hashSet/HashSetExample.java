package snippets8.hashSet.hashSet;

import java.util.HashSet;

/**
 * Created by root on 14/3/16.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet hset=new HashSet();
        hset.add(new Integer(1));
        hset.add(new Integer(2));
        hset.add(new Integer(3));


        boolean exists=hset.contains(new Integer(3));
        System.out.println("exists = " + exists);
    }
}
