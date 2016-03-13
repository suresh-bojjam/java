package snippets3;

/**
 * Created by root on 11/3/16.
 */
public class Student1 {
    int rno, rank;
    String name;

    public void setRno(int rno) {
        this.rno = rno;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRno() {
        return rno;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public Student1(){

    }
    public Student1(int rno, int rank, String name) {
        this.rno = rno;
        this.rank = rank;
        this.name = name;
    }

}
