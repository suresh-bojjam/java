package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class RemoveElementLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));

        System.out.println("ls = " + ls);

        boolean isRemoved=ls.remove(new Integer(3));
        System.out.println("isRemoved = " + isRemoved);
        System.out.println("ls = " + ls);
        
    }
}
