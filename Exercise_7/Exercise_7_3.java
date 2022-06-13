package Exercise_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise_7_3 {

	public static void main(String[] args) throws Exception {

		String sd = "13/06/2022";
		String ed = "12/06/2022";

		SimpleDateFormat sdf1 = new SimpleDateFormat("DD/mm/yyyy");
		Date std = sdf1.parse(sd);

		SimpleDateFormat sdf2 = new SimpleDateFormat("DD/mm/yyyy");
		Date edd = sdf2.parse(ed);

		if (std.compareTo(edd) == 1) {

			System.err.println("Error : End date is less than start date");
		}
	}
}