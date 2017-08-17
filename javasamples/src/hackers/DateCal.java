package hackers;

import java.util.Scanner;

public class DateCal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int dateOfReturn=sc.nextInt();
        int monthOfReturn=sc.nextInt();
        int yearOfReturn=sc.nextInt();
        int dateOfExpect=sc.nextInt();
        int monthOfExpect=sc.nextInt();
        int yearOfExpect=sc.nextInt();
        
        int fine=0;
        
        if((dateOfReturn<=dateOfExpect) && (monthOfReturn<=monthOfExpect) && (yearOfReturn <= yearOfExpect)) {
        	fine=0;
        }
        
        if(monthOfReturn==monthOfExpect) {
        	if(dateOfReturn>dateOfExpect) fine=15*(dateOfReturn-dateOfExpect);
        }
        
        if(yearOfReturn==yearOfExpect) {
        	if(monthOfReturn>monthOfExpect) fine=500*(monthOfReturn-monthOfExpect);
        }
        
        if(yearOfReturn>yearOfExpect) fine=10000;
          
        System.out.println(fine);
    }
}