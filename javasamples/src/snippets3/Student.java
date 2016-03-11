package snippets3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 11/3/16.
 */
//Constructor Overloading
public class Student {

    int rno, rank;
    String name;
    double attendancePercentage,attendance;

    public int getRno() {
        return rno;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public double getAttendance() {
        return attendance;
    }

    public Student(int rno, int rank, String name) {
        this.rno = rno;
        this.rank = rank;
        this.name = name;
    }

    public Student(double attendance, double attendancePercentage, String name, int rank, int rno) {
        this.attendance = attendance;
        this.attendancePercentage = attendancePercentage;
        this.name = name;
        this.rank = rank;
        this.rno = rno;
    }

    public static void main(String[] args) throws  Exception{
        int rno, rank;
        String name;
        double attendancePercentage,attendance;

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Student Name");
        name=bf.readLine();

        System.out.println("Enter the "+ name+" rank");
        rank=Integer.parseInt(bf.readLine());

        System.out.println("Enter the "+ name+" rno");
        rno=Integer.parseInt(bf.readLine());

        System.out.println("Enter the "+ name+" attendance");
        attendance=Integer.parseInt(bf.readLine());

        System.out.println("Enter the "+ name+" attendancePercentage");
        attendancePercentage=Integer.parseInt(bf.readLine());

        Student stu1=new Student(rno,rank,name);
        Student stu2=new Student(attendance,attendancePercentage,name,rank,rno);

        System.out.println("Name: "+stu1.getName());
        System.out.println("Rank: "+stu1.getRank());
        System.out.println("RNO: "+stu1.getRno());
        System.out.println();
        System.out.println("Name: "+stu1.getName());
        System.out.println("Rank: "+stu1.getRank());
        System.out.println("RNO: "+stu1.getRno());
        System.out.println("Attendance: "+stu2.getAttendance());
        System.out.println("AttendancePercentage: "+stu2.getAttendancePercentage());

    }
}
