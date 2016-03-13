package snippets2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by root on 11/3/16.
 */
public class Array1D {
    public static void main(String args[])throws Exception{

        int size;
        int array[]=new int[5];
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of Array");
        int limit=Integer.parseInt(bf.readLine());
        System.out.println("Enter the Array Elements");
        for(int i=0;i<limit;i++){
            array[i]=Integer.parseInt(bf.readLine());
        }

        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"]: "+array[i]);
        }
    }
}
