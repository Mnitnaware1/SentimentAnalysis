
package com.claritas.sms.core.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateUtil {

	/**
	 * Formatting date and time and returns as string.
	 * 
	 * @return String of date and time
	 */
	public static String getCurrentDateTimeAsString() {

		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// dateFormat.setTimeZone(TimeZone.getTimeZone(ID));
		Date date = new Date();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	/**
	 * Returning Current Date object
	 * 
	 * @return Date object
	 */
	public static Date getCurrentDateTime() {

		/* Get current date and time */
		// DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		// dateFormat.setTimeZone(TimeZone.getTimeZone(ID));
		Date date = new Date();
		return date;
	}

	/**
	 * Formatting date and time with UTC time zone and returns as string.
	 * 
	 * @return String of date and time with UTC
	 */
	public static String getCurrentDateTimeWithUTCAsString() {

		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = new Date();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	public static String getPastDateTimeWithUTCAsStringByHour(int hours) {
		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR_OF_DAY, -hours);
		Date date = calendar.getTime();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	public static String getPastDateTimeWithUTCAsStringByDays(int days) {
		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, -days);
		Date date = calendar.getTime();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	public static String getPastDateTimeWithUTCAsStringByMonths(int months) {
		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, -months);
		Date date = calendar.getTime();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	public static String getPastDateTimeWithUTCAsStringByYears(int years) {
		/* Get current date and time */
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, -years);
		Date date = calendar.getTime();
		String currentDateTime = dateFormat.format(date);
		return currentDateTime;
	}

	public static String getDateWithUTCDefAsString() {
		DateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		return currentDate;
	}

	public static String getDateWithESTAsString() {
		DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd hh:mm:ss zzz YYYY");
		dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
		Date date = new Date();
		String currentDate = dateFormat.format(date);
		return currentDate;
	}
}
