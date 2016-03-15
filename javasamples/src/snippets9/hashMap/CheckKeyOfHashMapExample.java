package snippets9.hashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class CheckKeyOfHashMapExample {
    public static void main(String[] args) {
        HashMap hm=new HashMap();

        hm.put("1","One");
        hm.put("2","Two");
        hm.put("3","Three");
        hm.put("4","Four");

        if(hm.containsKey("3")){
            System.out.println("Available");
        }else{
            System.out.println("NotAvailable");
        }
    }
}
