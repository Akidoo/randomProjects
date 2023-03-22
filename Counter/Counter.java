import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Counter {
	
	public static void main (String[] args) {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("YYMMDD");
		int date1 = Integer.parseInt(formatter.format(date));
		System.out.println(date1);
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 2, 18); //Year, month and day of month
		Date date2 = cal.getTime();
		int date2int = Integer.parseInt(formatter.format(date2));
		System.out.println(date2int);
		System.out.println((date1-date2int));
		
		
	}
}

