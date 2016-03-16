package snippets8.hashSet.treeSet;

import java.util.TreeSet;

/**
 * Created by root on 14/3/16.
 */
public class RemoveSpecifiedElementFromTreeSetExample {
    public static void main(String[] args) {
        TreeSet ts=new TreeSet();

        ts.add("1");
        ts.add("2");
        ts.add("3");
        ts.add("4");
        ts.add("5");
        ts.add("6");
        ts.add("7");
        ts.add("8");
        ts.add("9");

        System.out.println("ts = " + ts);
        ts.remove("6");
        System.out.println("ts = " + ts);
    }
}
