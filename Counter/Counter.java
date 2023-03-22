import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Counter {
	
	public static void main (String[] args) {
		Date date = new Date(); //Fetches current date
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //Puts current date into yyy/MM/dd format 

		long millis1 = date
		.toInstant().toEpochMilli(); //Converts date to milliseconds
		
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 1, 19); //Year, month and day of month
		Date date2 = cal.getTime(); //Anchor date
		long millis2 = date2
		.toInstant().toEpochMilli(); //Anchor date in milliseconds
		
		long count = millis1-millis2;
		count = count/86400000; //convert back to days
		
		System.out.println(count + " days");
	
		
		
	}
}

