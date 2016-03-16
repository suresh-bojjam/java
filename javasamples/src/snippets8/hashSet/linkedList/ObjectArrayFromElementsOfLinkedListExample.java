package snippets8.hashSet.linkedList;

import java.util.LinkedList;

/**
 * Created by root on 14/3/16.
 */
public class ObjectArrayFromElementsOfLinkedListExample {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();

        ls.add(new Integer(1));
        ls.add(new Integer(2));
        ls.add(new Integer(3));
        ls.add(new Integer(4));

        Object[] obj=ls.toArray();
        for(int index=0;index<obj.length;index++){
            System.out.println("obj[index] = " + obj[index]);
        }
    }
}
