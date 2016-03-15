package snippets9.hashMap.treeMap;

import java.util.TreeMap;

/**
 * Created by root on 15/3/16.
 */
public class RemoveValueFromTreeMapExample {
    public static void main(String[] args) {
        //create TreeMap object
        TreeMap treeMap = new TreeMap();

        //add key value pairs to TreeMap
        treeMap.put("1","One");
        treeMap.put("2","Two");
        treeMap.put("3","Three");

    /*
      To remove a key value pair from TreeMap use
      Object remove(Object key) method of TreeMap class.
      It returns either the value mapped with the key or null if no value
      was mapped.
    */

        Object obj = treeMap.remove("2");
        System.out.println(obj + " Removed from TreeMap");

    }
}
