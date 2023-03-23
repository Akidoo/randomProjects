import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Counter {
	
	public static void main (String[] args) {
		Date date = new Date(); //Fetches current date
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); //Puts current date into yyy/MM/dd format 

		long millis1 = date
		.toInstant().toEpochMilli(); //Converts date to milliseconds
		
		long monthsConverter = 2629746*1000;
		
		Calendar cal = Calendar.getInstance();
		cal.set(2023, 1, 19); //Year, month and day of month
		Date date2 = cal.getTime(); //Anchor date
		long millis2 = date2
		.toInstant().toEpochMilli(); //Anchor date in milliseconds
		
		long countMonths = millis1-millis2;
		countMonths = countMonths/monthsConverter;
		System.out.println(countMonths*-1 + " months");
		
		System.out.println("or");
		
		long countDays = millis1-millis2;
		countDays = countDays/86400000; //convert back to days
		System.out.println(countDays + " days");
		
		System.out.println("or");
		
		long countHours = millis1-millis2;
		countHours = countHours/3600000; //convert to hours
		System.out.println(countHours + " hours");
	
		
		
	}
}

