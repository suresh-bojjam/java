package snippets8.hashSet.hashSet;


import java.util.HashSet;
import java.util.Iterator;


/**
 * Created by root on 14/3/16.
 */
public class IterateThroughElementsOfHashTable {
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(new Integer(1));
        hs.add(new Integer(2));
        hs.add(new Integer(3));

        Iterator itr=hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
