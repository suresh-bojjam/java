package snippets10;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by root on 15/3/16.
 */
public class EnumerateThroughVectorExample {
    public static void main(String[] args) {
        Vector vc=new Vector();

        vc.add(1);
        vc.add(2);
        vc.add(3);
        vc.add(4);
        vc.add(5);
        vc.add(6);

        Enumeration e=vc.elements();
        while (e.hasMoreElements()){
            System.out.println("e.nextElement() = " + e.nextElement());
        }
    }
}
