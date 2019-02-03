import java.util.*;
import java.text.*;

public class TestC {


	public static void main(String[] args) {
		System.out.println("Test Test");

		// no new needed for primitive types
		double[] a = {1.0, 2.0, 3.4, 5.4};

		for (int i=0; i<a.length; i++) {
			System.out.println("i = "+ i+ ": "+ a[i]);
		}

		// find the largest element
		double  max=0.0;
		for (double e: a) {
			System.out.println(e);
			if (e > max) max = e;
		}
		System.out.println("Max = "+ max);

		// type[] arr = new type[size]; 


		/******************************************/
		// Date demo
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.getTime());

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println(sdf.format(d));

		String s = String.format("Current date/time: %tc", d);
		System.out.printf(s);
		System.out.println();

		try {
			long start = System.currentTimeMillis();
			System.out.println(new Date() + "\n");

			Thread.sleep(5*50*10);
			System.out.println(new Date() + " \n");

			long end = System.currentTimeMillis(); 
			long diff = end-start;
			System.out.println("Difference is "+ diff);
		} catch (Exception e) {
			System.out.println("Exception mil gaya");
		}

		GregorianCalendar gcal = new GregorianCalendar();
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec"};
		int year;

		System.out.print("Date: ");
		System.out.print(months[gcal.get(Calendar.MONTH)]);
		System.out.print(" " + gcal.get(Calendar.DATE) + " ");
		System.out.println(year =  gcal.get(Calendar.YEAR));
		System.out.print("Time: ");
		System.out.print(gcal.get(Calendar.HOUR));
		System.out.print(gcal.get(Calendar.MINUTE));
		System.out.println(gcal.get(Calendar.SECOND));

		if (gcal.isLeapYear(year)) {
			System.out.println("Current year is a leap year");
		}
	}
}
