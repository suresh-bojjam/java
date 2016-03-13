package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class RemoveRangeElementsLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));
        ls.add(new Integer(4));
        ls.add(new Integer(5));
        ls.add(new Integer(6));
        ls.add(new Integer(7));
        ls.add(new Integer(8));
        ls.add(new Integer(9));

        System.out.println("ls = " + ls);
        ls.subList(1,3).clear();
        System.out.println("ls = " + ls);
    }
}
