package hackers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
	
	static List<Object> dArray=null;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int rowSize=0;
		dArray=new ArrayList<Object>();
		for(int i=1;i<=limit;i++) {
			//System.out.println("rowSize?");
			rowSize=sc.nextInt();
			if(rowSize<=0) {
				dArray.add(null);
				continue;}
			int arr[]=new int[rowSize+1];
			for(int j=1;j<=rowSize;j++) {
				arr[j]=sc.nextInt();
			}
			dArray.add(arr);
		}
		
		for(int i=0;i<dArray.size();i++) {
			if(dArray.get(i)!=null) {
				int a[]=(int[])dArray.get(i);
				for(int element:a) {
					System.out.print(element+" ");
				}
				System.out.println();
			}else {
				System.out.println("null");
			}
		}
		
		//System.out.println("noOfQueries");
		int noOfQueries=sc.nextInt();
		for(int k=1;k<=noOfQueries;k++) {
			int rowNumber=sc.nextInt();
			int index=sc.nextInt();
			printValueAt(rowNumber,index);	
		}
	}
	
	private static void printValueAt(int rowNumber,int index) {
		try {
			int[] a=(int[])dArray.get(rowNumber-1);
			System.out.println(a[index]);
		} catch (Exception e) {
			System.out.println("ERROR!");
		}
	}
}
/*
https://www.hackerrank.com/challenges/java-arraylist/problem

i/p:
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

o/p:
74
52
37
ERROR!
ERROR!
 
 */