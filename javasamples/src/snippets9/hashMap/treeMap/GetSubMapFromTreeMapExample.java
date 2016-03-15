package snippets9.hashMap.treeMap;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by root on 14/3/16.
 */
public class GetSubMapFromTreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");

        SortedMap sortedMap=tm.subMap(1,4);
        System.out.println("sortedMap = " + sortedMap);
    }
}
