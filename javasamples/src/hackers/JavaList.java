package hackers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<size;i++) list.add(sc.nextInt());

		int value=sc.nextInt();
		String str=null;
		int index;
		int element;

		for(int i=0;i<value;i++) {
			str=sc.next();
			if(str.equals("Insert")) {
				index=sc.nextInt();
				element=sc.nextInt();
				list.add(index,element);
			}else if(str.equals("Delete")){
				index=sc.nextInt();
				list.remove(index);
			}/*else {
				System.out.println("wrong choice");
			}*/
		}
		
		for(int val:list)System.out.print(val+" ");
	}
}

/*
https://www.hackerrank.com/challenges/java-list/problem
i/p:
5
12 0 1 78 12
2
Insert
5 23
Delete
0

o/p:
0 1 78 12 23
*/
