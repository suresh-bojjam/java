package hackers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalanderTest {

	public static void main(String[] args) throws ParseException {
		
		Date date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse("2011-01-01 00:00:00");
		System.out.println(new SimpleDateFormat("EEEEEE").format(date));
	}
}
