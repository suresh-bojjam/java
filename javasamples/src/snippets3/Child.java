package snippets3;

/**
 * Created by root on 12/3/16.
 */
public class Child extends Father implements Mother,GrandMother{
    void property(){
        System.out.println("payment = " + paymentFather+payment+paymentGrandMother);
    }
    void height(){
        System.out.println("height " + (float)(heightFather+heightGrandMother+heightMother)/3);
    }
}
