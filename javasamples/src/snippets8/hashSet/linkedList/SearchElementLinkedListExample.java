package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class SearchElementLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));
        ls.add(new Integer(2));
        ls.add(new Integer(3));
        ls.add(new Integer(4));
        ls.add(new Integer(5));
        ls.add(new Integer(6));
        ls.add(new Integer(7));

        int index=ls.indexOf(new Integer(0));

        if(index!=-1)
            System.out.println("First Occurance of Elenent Index: " + index);
        else
            System.out.println("Element Not Found");

    }
}
