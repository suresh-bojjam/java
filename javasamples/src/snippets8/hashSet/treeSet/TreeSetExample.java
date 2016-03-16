package snippets8.hashSet.treeSet;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class TreeSetExample {
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

        System.out.println("ts = " + ts);
        System.out.println("ts.isEmpty() = " + ts.isEmpty());
        System.out.println("ts = " + ts);
        System.out.println("ts.first() = " + ts.first());
        System.out.println("ts.last() = " + ts.last());
        System.out.println("ts.size() = " + ts.size());
        System.out.println("ts.subSet(\"3\") = " + ts.subSet("3","6"));
        System.out.println("ts.headSet(\"1\",\"5\") = " + ts.headSet("1"));
        System.out.println("ts.tailSet(\"6\") = " + ts.tailSet("6"));
        ts.clear();
        System.out.println("ts.isEmpty() = " + ts.isEmpty());
        System.out.println("ts = " + ts);
        System.out.println("ts.contains(\"5\") = " + ts.contains("5"));

        Object[] array=ts.toArray();
        for(int index=0;index<array.length;index++){
            System.out.println("index[index] = " + array[index]);
        }

        Iterator it=ts.iterator();
        while (it.hasNext()) {
            System.out.println("it.next() = " + it.next());
        }
        ts.clear();
    }
}
