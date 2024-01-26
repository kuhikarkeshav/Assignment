import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddDaysToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if (args.length != 2) {
	            System.out.println("Usage: java AddDaysToDate <date> <days>");
	            System.exit(1);
	        }

	        String inputDate = args[0];
	        int daysToAdd = Integer.parseInt(args[1]);

	        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	        try {
	            Date date = sdf.parse(inputDate);

	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date);
	            calendar.add(Calendar.DAY_OF_MONTH, daysToAdd);

	            String outputDate = sdf.format(calendar.getTime());
	            System.out.println(outputDate);
	        } catch (ParseException e) {
	            System.out.println("Invalid date format. Please use dd-MM-yyyy.");
	        }
	    }
}
