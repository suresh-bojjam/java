package snippets8.hashSet.linkedList;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by root on 14/3/16.
 */
public class GetSubListLinkedListJavaExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));

        System.out.println("ls = " + ls);

        List l=ls.subList(0,2);
        System.out.println("l = " + l);
    }
}
