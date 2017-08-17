package hackers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterMails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int limit=sc.nextInt();
		List<String> names=new ArrayList<String>();
		String str=null;
		String reg="[a-z]+@gmail\\.com$";
		Pattern p=Pattern.compile(reg);

		for(int i=1;i<=limit;i++) {
			str=sc.next();
			Matcher m=p.matcher(sc.next());
			if(m.find()) {
				names.add(str);
			}
		}
		
		Collections.sort(names);
		for(String string:names) {
			System.out.println(string);
		}
	}
}
