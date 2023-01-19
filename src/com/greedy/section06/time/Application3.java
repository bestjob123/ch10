package com.greedy.section06.time;

import java.time.LocalDateTime;

public class Application3 {

	public static void main(String[] args) {

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.hashCode());
		
		LocalDateTime localDateTime2 = localDateTime.plusMinutes(30);
		System.out.println(localDateTime2);
		System.out.println(localDateTime2.hashCode());
		
		System.out.println(localDateTime == localDateTime2);
		
		LocalDateTime localDateTime3 = localDateTime.minusHours(3);
		System.out.println(localDateTime3);
	}

}
