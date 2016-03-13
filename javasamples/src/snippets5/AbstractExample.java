package snippets5;

/**
 * Created by root on 13/3/16.
 */
public class AbstractExample {
    public static void main(String[] args) {
        CTS c=new CTS(001,"student1");
        TCS t=new TCS(002,"student2");
        Recruitment rt;
        rt=c;
        rt.eligibilityCriteria();
        rt.writtenTest();
        rt.interviewProcess();
        rt.packageDetails();
    }
}
