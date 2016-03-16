package snippets11;

import java.io.*;
/**
 * Created by root on 16/3/16.
 */
class Employee implements Serializable
{
    String eno="u";
    int rno = 007;
    float sal=19.22f;
    String disp() { return "hi";}
}
public class SerializeBoolean
{
    SerializeBoolean() throws Exception
    {
        FileOutputStream fos=new FileOutputStream("./boolean.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(new Employee());
        oos.writeObject(new Employee().disp());
        oos.close();
        FileInputStream fis=new FileInputStream("./boolean.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Employee emp=(Employee)ois.readObject();
        System.out.println((String) ois.readObject());
        System.out.println (emp.eno+"\t"+emp.rno+"\t"+emp.sal);
        ois.close();
    }
    public static void main(String args[]) throws Exception
    {
        SerializeBoolean ob=new SerializeBoolean();
    }
}


