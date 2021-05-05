   import java.util.*;
	public class TimeZoneTest{
	   public static void main(String[] args)
	    {
	     Calendar calNewYork = Calendar.getInstance();
	     calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		    System.out.println(); 
	      System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
	        + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
			   System.out.println(); 
			   
			   
			   Calendar calAmerica = Calendar.getInstance();
			     calAmerica.setTimeZone(TimeZone.getTimeZone("America"));
				    System.out.println(); 
			      System.out.println("Time in America: " + calAmerica.get(Calendar.HOUR_OF_DAY) + ":"
			        + calAmerica.get(Calendar.MINUTE)+":"+calAmerica.get(Calendar.SECOND));
					   System.out.println();
					   
					   
					   Calendar calIndia = Calendar.getInstance();
					     calIndia.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
						    System.out.println(); 
					      System.out.println("Time in India: " + calIndia.get(Calendar.HOUR_OF_DAY) + ":"
					        + calIndia.get(Calendar.MINUTE)+":"+calIndia.get(Calendar.SECOND));
							   System.out.println();
	    }
	}

