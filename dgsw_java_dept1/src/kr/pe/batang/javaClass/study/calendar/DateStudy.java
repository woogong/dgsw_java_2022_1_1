package kr.pe.batang.javaClass.study.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateStudy {

	public void studyDate() {
		Date date = new Date();
		System.out.println(date);
		
		Date date2 = new Date(1000000000000L);
		System.out.println(date2);
		System.out.println(date.getTime());
		
		Date date3 = new Date(100, 0, 1);	// 2000³â 1¿ù 1ÀÏ
		System.out.println(date3);
		
		long days = (date.getTime() - date3.getTime()) / (24 * 60 * 60 * 1000);
		System.out.println(days);
		
	}
	
	public void studyCalendar() {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		calendar.set(Calendar.YEAR, 1988);
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int date = calendar.get(Calendar.DATE);
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		long unixTime = calendar.getTimeInMillis();
		
		System.out.printf("%04d-%02d-%02d %02d:%02d:%02d\n", year, (month + 1), date, hours, 
				minute, second);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
		String str = simpleDateFormat.format(unixTime);
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		DateStudy dateStudy = new DateStudy();
		//dateStudy.studyDate();
		dateStudy.studyCalendar();
		
		
	}
}
