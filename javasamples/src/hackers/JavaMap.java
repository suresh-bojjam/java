package hackers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		Map<String,Integer> map=new HashMap<String,Integer>();
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}

		/*		try (BufferedReader reader = new BufferedReader(new StringReader(text))) {
			String line = reader.readLine();
			while (line != null) {
				result.add(line);
				line = reader.readLine();
			}
		} catch (IOException exc) {
			// quit
		}
*/
	
		String str=null;
		while(in.hasNextLine())
		{
			str=in.nextLine();
			if(map.containsKey(str)) System.out.println(str+"="+map.get(str));
			else System.out.println("Not found");
		}
	}
}

/*
https://www.hackerrank.com/challenges/phone-book/problem 
i/P:
3
uncle sam
99912222
tom
11122222
harry
12299933
uncle sam
uncle tom
harry

o/p:
uncle sam=99912222
Not found
harry=12299933
 */