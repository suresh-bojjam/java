package snippets8.hashSet.treeSet;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class IterateThroughElementsOfTreeSetExample {
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

        Iterator it=ts.iterator();
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    }
}
