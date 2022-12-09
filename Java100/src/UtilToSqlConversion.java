import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UtilToSqlConversion {

	public static void main(String[] args) {
		java.util.Date utilDate = new java.util.Date();
		System.out.println("Java util data is : " + utilDate);
		java.sql.Date sqlDate = convert(utilDate);
		System.out.println("SQL converted date is: " + sqlDate);
		
		DateFormat df = new SimpleDateFormat("dd/MM/YYYY - hh:mm:ss");
		System.out.println("date format date is: " + df.format(utilDate));
		
		java.util.Date date = Calendar.getInstance().getTime();
		System.out.println("Date is "+date);
		
		System.out.println("======================================");
		
		String formatString = "yyyy/MM/dd: hh:mm.ss";
		java.util.Date xdate = Calendar.getInstance().getTime();
		SimpleDateFormat dateFormated = new SimpleDateFormat(formatString);
		
		System.out.println(dateFormated.getCalendar().getTime());
		System.out.println("X date is: " +xdate);
		

	}

	private static Date convert(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
		
		
		return sDate;
		
	}

}
