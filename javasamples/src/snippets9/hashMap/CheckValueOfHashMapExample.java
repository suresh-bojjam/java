package snippets9.hashMap;

import java.util.HashMap;

/**
 * Created by root on 14/3/16.
 */
public class CheckValueOfHashMapExample {
    public static void main(String[] args) {
        HashMap hm=new HashMap();

        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,"Four");
        hm.put(5,"Five");
        hm.put(6,"Six");
        hm.put(7,"Seven");

        System.out.println("hm = " + hm);
        if(hm.containsValue("Four")){
            System.out.println("Data Found");
        }else{
            System.out.println("Data Not Found");
        }
    }
}
