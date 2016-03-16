package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class GetFirstAndLastElementLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));

        System.out.println("ls.getFirst() = " + ls.getFirst());
        System.out.println("ls.getLast() = " + ls.getLast());
    }
}
