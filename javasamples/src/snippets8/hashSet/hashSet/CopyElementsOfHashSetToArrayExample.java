package snippets8.hashSet.hashSet;
import java.util.HashSet;

/**
 * Created by root on 14/3/16.
 */
public class CopyElementsOfHashSetToArrayExample {
    public static void main(String[] args) {
        HashSet hset=new HashSet();

        hset.add(new Integer(1));
        hset.add(new Integer(2));
        hset.add(new Integer(3));

        Object objArray[]=hset.toArray();

        for(int index=0;index<objArray.length;index++){
            System.out.println("objArray[index] = " + objArray[index]);
        }
    }
}
