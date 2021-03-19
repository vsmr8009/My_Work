package com.cognizant.truyum.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
		
		Date date1;
		try {
			date1 = simpleDateFormat.parse(date);
			return date1;
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
