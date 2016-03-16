package snippets8.hashSet.linkedList;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by root on 14/3/16.
 */
public class IterateLinkedListUsingListIteratorExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));

        ListIterator lit=ls.listIterator();
        System.out.println("lit = " + lit);
        while (lit.hasNext()){
            System.out.println("lit.next() = " + lit.next());
        }
        
        while(lit.hasPrevious()){
            System.out.println("lit.previous() = " + lit.previous());
        }
        
    }
}
