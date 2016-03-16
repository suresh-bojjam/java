package snippets8.hashSet.treeSet;

import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class GetLowestHighestValueTreeSetExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add(new Integer(1));
        ts.add(new Integer(2));
        ts.add(new Integer(3));
        ts.add(new Integer(4));
        ts.add(new Integer(50));
        ts.add(new Integer(60));
        ts.add(new Integer(7));
        ts.add(new Integer(8));
        ts.add(new Integer(9));

        System.out.println("ts.first() = " + ts.first());
        System.out.println("ts.last() = " + ts.last());
    }
}
