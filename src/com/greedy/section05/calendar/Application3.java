package com.greedy.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application3 {

	public static void main(String[] args) {

		/* 올 해 크리스마스는 무슨요일일까요? */
		/* 2023년 12월 25일 월요일 형태로 출력*/
		int year = 2023;
		int month = 11;
		int dayOfMonth = 25;
		
		Calendar christmas = new GregorianCalendar(year,month,dayOfMonth);
		System.out.println(christmas);
	
		java.util.Date date = new java.util.Date(christmas.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year,month,dayOfMonth).getTimeInMillis());
		System.out.println(date2);
		
		System.out.println("dayOfWeek : " + christmas.get((Calendar.DAY_OF_WEEK)));
		
		String day = "";
		switch(christmas.get((Calendar.DAY_OF_WEEK))) {
		case Calendar.SUNDAY :
			day = "일요일";
			break;
		case Calendar.MONDAY :
			day = "월요일";
			break;
		case Calendar.TUESDAY :
			day = "화요일";
			break;
		case 4 :
			day = "수요일";
			break;
		case 5 :
			day = "목요일";
			break;
		case 6 :
			day = "금요일";
			break;
		case 7 :
			day = "토요일";
			break;
		}
		System.out.println(""+ day);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일"+day);
		sdf.format(new Date(christmas.getTimeInMillis()));
		String result = sdf.format(new Date(christmas.getTimeInMillis()));
		
		System.out.println(result);
	
		
	}

}
