package snippets9.hashMap.treeMap;

import java.util.TreeMap;

/**
 * Created by root on 14/3/16.
 */
public class CheckValueOfTreeMapExample {
    public static void main(String[] args) {
        TreeMap tm=new TreeMap();

        tm.put(1,"One");
        tm.put(2,"Two");
        tm.put(3,"Three");
        tm.put(4,"Four");
        tm.put(5,"Five");

        if(tm.containsValue("Four")){
            System.out.println("Data Found");
        }else{
            System.out.println("Data NotFound");
        }

    }
}
