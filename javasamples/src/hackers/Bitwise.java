package hackers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		int n;
		int k;
		int maxPossibleValue=0;
		for(int i=1;i<=limit;i++) {
			maxPossibleValue=0;
			n=sc.nextInt();
			k=sc.nextInt();
			for(int j=1;j<n;j++) {
				for(int l=j;l<=n;l++) {
					if((j&(l+1))<k){
						if(maxPossibleValue<(j&(l+1))) {
							maxPossibleValue=j&(l+1);
						}
					}	
				}
			}
			System.out.println(maxPossibleValue);
		}
	
/*		        Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		        for(int a0 = 0; a0 < t; a0++){
		            int n = in.nextInt();
		            int k = in.nextInt();
		            if(((k-1)|k) > n && k%2==0){
		                System.out.println(k-2);
		            }else{
		                System.out.println(k-1);               
		            }
		        }*/
    }
}