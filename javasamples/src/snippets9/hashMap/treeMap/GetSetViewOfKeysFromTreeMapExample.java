package snippets9.hashMap.treeMap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by root on 14/3/16.
 */
public class GetSetViewOfKeysFromTreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");

        Set set=tm.keySet();
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    }
}
