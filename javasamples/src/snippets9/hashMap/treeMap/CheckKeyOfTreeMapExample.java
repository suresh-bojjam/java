package snippets9.hashMap.treeMap;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by root on 14/3/16.
 */
public class CheckKeyOfTreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");
        tm.put(6,"Six");

        if(tm.containsKey(4)){
            System.out.println("Value Found");
        }else {
            System.out.println("Value Not Found");
        }
    }
}
