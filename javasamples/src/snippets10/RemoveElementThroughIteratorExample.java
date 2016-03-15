package snippets10;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by root on 15/3/16.
 */
public class RemoveElementThroughIteratorExample {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();

        ar.add("One");
        ar.add("Two");
        ar.add("Three");
        ar.add("Four");
        ar.add("Five");

        Iterator itr=ar.iterator();

        String strElement = "";
        while(itr.hasNext()){

      /*
        Iterator's next method returns an Object so we need to cast it into
        appropriate class before using it.
      */
            strElement = (String)itr.next();
            if(strElement.equals("2"))
            {
        /*
          Remove an element using remove() method of Iterator
          Remove method removes an element from underlying collection and
          it may throw a UnsupportedOperationException if the remove
          operation is not supported.
        */
                itr.remove();
                break;
            }
        }
    }
}
