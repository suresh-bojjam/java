package snippets10;

import sun.misc.Compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/**
 * Created by root on 15/3/16.
 */
public class SortVectorInDescendingOrderExample {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        System.out.println("v = " + v);
        Comparator c= Collections.reverseOrder();
        Collections.sort(v,c);
        System.out.println("v = " + v);
    }
}
