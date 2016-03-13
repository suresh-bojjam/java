package snippets4;

/**
 * Created by root on 13/3/16.
 */
public class DynamicDispatch{

    public void display(){

    }

    public static void main(String[] args) {
        Sup s; //super class reference variable
        Sub1 s1=new Sub1();
        Sub2 s2=new Sub2();
        s=s1;   //can refer to any subclass
        s.display();
    }
}
