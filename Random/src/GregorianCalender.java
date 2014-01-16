import java.util.GregorianCalendar;
import java.util.Calendar;

public class GregorianCalender {

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar(2013, Calendar.OCTOBER, 16);
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		GregorianCalendar laurensBirthday = new GregorianCalendar(2014, Calendar.AUGUST, 1);
		System.out.println(laurensBirthday.get(Calendar.MONTH));
		
		GregorianCalendar laurensBirthday2 = new GregorianCalendar(2014, Calendar.AUGUST, 1);
		laurensBirthday2.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println(laurensBirthday2.get(Calendar.MONTH));
		
	}

}
