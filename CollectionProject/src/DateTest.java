
	import java.util.*;

	public class DateTest {
		
		public static void main(String[] args) {
			
			Date d = new Date();
			System.out.println("Date is "+d);
			
			Calendar c =  Calendar.getInstance();
			
			System.out.println(c.get(Calendar.DAY_OF_MONTH));
			System.out.println(c.get(Calendar.MONTH)+1);
			System.out.println(c.get(Calendar.YEAR));
			
			
		}
	}


