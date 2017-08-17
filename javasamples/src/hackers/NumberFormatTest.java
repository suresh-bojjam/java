package hackers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		double d=12324.134;
		Locale indiaLocale = new Locale("en", "IN");
		
		NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
		NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
		
		System.out.println("US: "+us.format(d));
		System.out.println("India: "+india.format(d));
		System.out.println("China: "+china.format(d));
		System.out.println("France: "+france.format(d));
	}
}
