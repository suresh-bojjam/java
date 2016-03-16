package snippets8.hashSet.treeSet;

import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class CheckValueOfTreeSetExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add(new Integer(1));
        ts.add(100);
        ts.add("treeSet1");

        ts.add(new Integer(2));
        ts.add(200);
        ts.add("treeSet2");

        ts.add(new Integer(3));
        ts.add(300);
        ts.add("treeSet3");
        
        boolean exists=ts.contains("3");
        if(exists)
            System.out.println("exists = " + exists);
        else
            System.out.println("exists = " + exists);
    }
}
