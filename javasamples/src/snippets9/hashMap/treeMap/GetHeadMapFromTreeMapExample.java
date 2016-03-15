package snippets9.hashMap.treeMap;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/**
 * Created by root on 14/3/16.
 */
public class GetHeadMapFromTreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");

        SortedMap sortedMap=tm.headMap(4);
        System.out.println("sortedMap = " + sortedMap);
    }
}
