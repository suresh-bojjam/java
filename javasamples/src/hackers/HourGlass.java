package hackers;

import java.util.Scanner;

public class HourGlass {
	
	static int arr[][];
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        arr = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        //display();
        System.out.println("mazHourGlass: "+findMaxHourGlass());
	}
	
	private static int findMaxHourGlass() {
		int maxHourGlass=-9999;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
/*				System.out.println(arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+"\n "+
						arr[i+1][j+1]+"\n"+
						arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]);*/
				
				int size=arr[i][j]+arr[i][j+1]+arr[i][j+2]+
				arr[i+1][j+1]+
				arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
				//System.out.println("size: "+size);
				if(size>maxHourGlass)maxHourGlass=size;
			}
		}
		return maxHourGlass; 
	}
	
	private static void display() {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}

/*
https://www.hackerrank.com/challenges/java-2d-array/problem

i/p:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

o/p:
7

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0

i/p:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

o/p:
19

*/