package snippets8.hashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by root on 14/3/16.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(new Integer(1));
        hs.add(new Integer(2));
        hs.add(new Integer(3));

        if(hs.contains(new Integer(3))){
            System.out.println("availabe");
        }else{
            System.out.println("not available ");
        }


        Object[] array=hs.toArray();
        //Convertin HashSet to Array
        for(int index=0;index<array.length;index++){
            System.out.println(array[index]);
        }


        Iterator it=hs.iterator();
        
        while (it.hasNext()){
            System.out.println("it.next() = " + it.next());
        }
    }
}
