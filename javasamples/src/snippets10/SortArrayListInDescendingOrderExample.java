package snippets10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by root on 15/3/16.
 */
public class SortArrayListInDescendingOrderExample {
    public static void main(String[] args) {
        ArrayList ar =new ArrayList();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);

        System.out.println("ar = " + ar);
        Comparator c= Collections.reverseOrder();
        Collections.sort(ar,c);
        System.out.println("ar = " + ar);
    }
}
