package snippets8.hashSet.treeSet;

import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class CopyElementsOfTreeSetToArrayExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(new Integer(1));
        ts.add(new Integer(2));
        ts.add(new Integer(3));
        ts.add(new Integer(4));
        ts.add(new Integer(5));
        ts.add(new Integer(6));

        Object[] array=ts.toArray();

        for(int index=0;index<array.length;index++){
            System.out.println("array[index] = " + array[index]);
        }
    }
}
