package snippets5;

/**
 * Created by root on 13/3/16.
 */
public class CTS extends Recruitment{

    public CTS(int a, String b) {
        super(a, b);
    }

    @Override
    void eligibilityCriteria() {
        super.eligibilityCriteria();
    }

    @Override
    void writtenTest() {
        System.out.println("Time 60 Mins 30 aplitude questions,10 logical reasoning, 10 technical");
    }

    @Override
    void interviewProcess() {
        System.out.println("Technical round && HR round");
    }

    @Override
    void packageDetails() {
        System.out.println("3.5 Lac per annum");
    }

    public static void main(String[] args) {

    }
}

