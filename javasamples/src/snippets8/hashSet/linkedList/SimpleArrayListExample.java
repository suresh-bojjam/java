package snippets8.hashSet.linkedList;

import java.util.ArrayList;

/**
 * Created by root on 14/3/16.
 */
public class SimpleArrayListExample {
    public static void main(String[] args) {
        ArrayList ar=new ArrayList();

        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        ar.add(7);
        ar.add(8);

        for(int index=0;index<ar.size();index++){
            System.out.println("ar[index] = " + ar.get(index));
        }
    }
}
