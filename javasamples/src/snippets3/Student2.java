package snippets3;

/**
 * Created by root on 11/3/16.
 */
public class Student2 extends Student1{
    double per, att;

    public Student2(){}

    public Student2(double per, double att) {
        this.per = per;
        this.att = att;
    }

    public Student2(int rno, int rank, String name, double per, double att) {
        super(rno, rank, name);
        this.per = per;
        this.att = att;
    }
}

