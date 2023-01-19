package com.greedy.section06.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class Application4 {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		LocalDate past = LocalDate.of(2020, 11, 11);
		LocalDateTime future = LocalDateTime.of(2024, 12, 25,12,0,0);
		ZonedDateTime now = ZonedDateTime.now();
		
		System.out.println(localDate.isAfter(past));
		System.out.println(localDateTime.isBefore(future));
		System.out.println(zonedDateTime.isEqual(now));
		
	}

}
