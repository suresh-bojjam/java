package snippets8.hashSet.treeSet;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class GetTailSetFromTreeSetExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add("1");
        ts.add("2");
        ts.add("3");
        ts.add("4");
        ts.add("5");
        ts.add("6");
        ts.add("7");
        ts.add("8");
        ts.add("9");


        SortedSet sorted=ts.tailSet("5");
        System.out.println("sorted = " + sorted);


    }
}
