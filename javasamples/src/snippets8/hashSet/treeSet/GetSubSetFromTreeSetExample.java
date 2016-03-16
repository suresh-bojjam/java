package snippets8.hashSet.treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class GetSubSetFromTreeSetExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add("1");
        ts.add("2");
        ts.add("3");
        ts.add("4");
        ts.add("5");

        SortedSet sorted = ts.subSet("1","4");

        System.out.println("sorted = " + sorted);
    }
}
