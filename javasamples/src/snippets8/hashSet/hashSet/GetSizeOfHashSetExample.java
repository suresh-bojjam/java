package snippets8.hashSet.hashSet;

import java.util.HashSet;

/**
 * Created by root on 14/3/16.
 */
public class GetSizeOfHashSetExample {
    public static void main(String[] args) {
        HashSet hs=new HashSet();
        hs.add(new Integer(1));
        hs.add(new Integer(2));
        hs.add(new Integer(3));

        System.out.println("hs.size() = " + hs.size());
        hs.remove(new Integer(3));
        System.out.println("hs.size() = " + hs.size());
    }
}
