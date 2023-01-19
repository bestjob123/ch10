package com.greedy.section05.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Application4 {

	public static void main(String[] args) {

		/* 0년 1월 1일 부터 오늘까지 몇 일이나 지났을까요? 
		 * 단, 중간에 윤년을 고려해야 함
		 * */
		
		Calendar gregorianCalendar =new GregorianCalendar();
//		System.out.println(gregorianCalendar);
		
		int sumDay =0;
		for(int i =0;i<2023;i++) {
			Calendar calendar = new GregorianCalendar(i,11,31);
		
			sumDay += calendar.get(Calendar.DAY_OF_YEAR);
		}
		sumDay += Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		System.out.println(sumDay);
		
		
	}

}
