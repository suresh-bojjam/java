package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class LinkedListReplaceElementExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(12));
        ls.add(new Integer(34));
        ls.add(new Integer(56));

        System.out.println("ls = " + ls);

        ls.set(2,10);
        System.out.println("ls = " + ls);
    }
}
