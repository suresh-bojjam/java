package snippets3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 11/3/16.
 */
public class InheritanceStudentClass {
    public static void main(String[] args) throws Exception{
        String n,h,a,g;
        int r,rk;
        double p,att;

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Student Name");
        n=bf.readLine();

        System.out.println("Enter the Student RNo");
        r=Integer.parseInt(bf.readLine());

        System.out.println("Enter the Student rank");
        rk=Integer.parseInt(bf.readLine());

        System.out.println("Enter the Student hobbie");
        h=bf.readLine();

        System.out.println("Enter the Student goal");
        g=bf.readLine();

        System.out.println("Enter the Student a");
        a=bf.readLine();

        System.out.println("Enter the Student attendance percentage");
        p=Double.parseDouble(bf.readLine());

        System.out.println("Enter the Student attendance");
        att=Double.parseDouble(bf.readLine());

        Student3 student=new Student3(r,rk,n,p,att,h,g,a);
    }
}
