package snippets3;

/**
 * Created by root on 11/3/16.
 */
public class Student3 extends Student2{
    String hob,goal, ach;

    public Student3(String hob, String goal, String ach) {
        this.hob = hob;
        this.goal = goal;
        this.ach = ach;
    }

    public Student3(double per, double att, String hob, String goal, String ach) {
        super(per, att);
        this.hob = hob;
        this.goal = goal;
        this.ach = ach;
    }

    public Student3(int rno, int rank, String name, double per, double att, String hob, String goal, String ach) {
        super(rno, rank, name, per, att);
        this.hob = hob;
        this.goal = goal;
        this.ach = ach;
    }
    void displayDetails(){
        System.out.println("Student Information");
        System.out.println("name: "+name);
        System.out.println("rno = " + rno);
        System.out.println("rank = " + rank);
        System.out.println("name = " + name);
        System.out.println("per = " + per);
        System.out.println("goal = " + goal);
        System.out.println("ach = " + ach);
    }
}
