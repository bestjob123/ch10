package com.greedy.section05.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application2 {

	public static void main(String[] args) {

		/* Calendar 클래스 사용 */
		
		/* Calendar 클래스를 이용한 인스턴스 생성 방법 
		 * 1.getInstance(): static 메소드를 이용해서 인스턴스를 반환받는 방법
		 * 2.후손 클래스인 GregorianCalendar 클래스를 이용해서 인스턴스를 생성하는 방법
		 * */
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		Calendar gregorianCalendar =new GregorianCalendar();
		System.out.println(gregorianCalendar);
		
		int year = 2014;
		int month = 8;
		int dayOfMonth = 18;
		int hour = 16;
		int min = 42;
		int second = 0;
		
		Calendar birthDay = new GregorianCalendar(year,month,dayOfMonth,hour,min,second);
		System.out.println(birthDay);
		
		java.util.Date date = new java.util.Date(birthDay.getTimeInMillis());
		System.out.println(date);
		
		Date date2 = new Date(new GregorianCalendar(year,month,dayOfMonth,hour,min,second).getTimeInMillis());
		System.out.println(date2);
		
		int birthYear = birthDay.get(1);
		int birthMonth = birthDay.get(2);
		int birthDayOfMonth = birthDay.get(5);
		
		System.out.println(birthYear);
		System.out.println(birthMonth);
		System.out.println(birthDayOfMonth);
		
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DATE);
		
		System.out.println("year : "+ birthDay.get((Calendar.YEAR)));
		System.out.println("month : " + birthDay.get((Calendar.MONTH)));
		System.out.println("day : " + birthDay.get((Calendar.DATE)));
		
		System.out.println("dayOfWeek : " + birthDay.get((Calendar.DAY_OF_WEEK)));
		
		String day = "";
		switch(birthDay.get((Calendar.DAY_OF_WEEK))) {
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
		System.out.println("요일 : "+ day);
		System.out.println("amPm : " + birthDay.get((Calendar.AM_PM)));
		System.out.println(birthDay.get(Calendar.AM_PM)== Calendar.AM ? "오전" : "오후");
		
		System.out.println("hourOfDay : " + birthDay.get(Calendar.HOUR_OF_DAY));
		System.out.println("hour : " + birthDay.get(Calendar.HOUR));
		
		System.out.println("min :" + birthDay.get(Calendar.MINUTE));
		System.out.println("second : " + birthDay.get((Calendar.SECOND)));
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
		sdf.format(new Date(birthDay.getTimeInMillis()));
		String result = sdf.format(new Date(birthDay.getTimeInMillis()));
		
		System.out.println(result);
	}

}
