package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class CheckElementLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));

        if(ls.contains(new Integer(4)))
            System.out.println("4 is available in the LinkedList");
        else
            System.out.println("4 is Not available in the LinkedList");

        if(ls.contains(new Integer(2)))
            System.out.println("2 is available in the LinkedList");
        else
            System.out.println("2 is Not available in the LinkedList");
    }
}
