package snippets9.hashMap;

import java.util.HashMap;

/**
 * Created by root on 14/3/16.
 */
public class JavaHashMapExample {
    public static void main(String[] args) {
        HashMap hm=new HashMap();


        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");

        Object obj=hm.get(1);
        System.out.println(obj);
    }
}
