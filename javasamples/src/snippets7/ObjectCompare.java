package snippets7;

/**
 * Created by root on 13/3/16.
 */
public class ObjectCompare {
    public static void main(String[] args) {
        ObjectCompare b1=new ObjectCompare();
        ObjectCompare b2=new ObjectCompare();
        System.out.println("b1 = " + b1);
        System.out.println("b1 hashCode= " + b1.hashCode());
        System.out.println("b2 = " + b2);
        System.out.println("b2 hashCode= " + b2.hashCode());
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));
        String str1="programming";
        String str2="programming";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
