package com.greedy.section05.calendar;

public class Application {

	public static void main(String[] args) {

		/* Date 클래스
		 * JDK 1.0 부터 날짜를 취급하기 위해 사용되던 Date 클래스는
		 * 생성자를 비롯하여 대부분 메소드가 Deprecated 되어있다.
		 * 
		 * Deprecated란?
		 * 향후 버전이 업데이트 되면서 사라지게 될 기능이니 가급적이면 사용을 권장하지 않는다는 의미이다.
		 * 하지만 하위 버전의 호환성 때문에 한번에 없애는 것이 아니고 남겨둔 것이니 사용하는 것은 가능하긴 하다.
		 * 
		 * Calendar 클래스
		 * JDK 1.1부터 새롭게 제공되는 Calendar,클래스를 이용하여 날짜와 시간에 관련된 처리를 하는걸 권장한다.
		 * Calendar클래스는 몇가지 문제를 가지고 있다.
		 * 
		 * 1. Calendar 인스턴스는 불변객체가 아니기 때문에 값을 수행할 수 있다.
		 * 2. 윤초(leaf second)를 고려하지 않는다.
		 * 3. Calendar 클래스는 일을 표현할때 0~11 까지로 표현하는 불편함이 있다.
		 * 
		 * JDK 1.8에서는 이러한 모든 문제를 해결할 수 있는 time 패키지를 제공한다.
		 * 
		 * Data는 java.sql.Date와 java.util.Date가 존재한다.
		 * */
		/* 1. 기본생성자를 사용하는 방법 */
		java.util.Date today = new java.util.Date();
		java.sql.Date today2 = new java.sql.Date(0);
		System.out.println(today);
		
		/* 2. Date(long date) 사용하는 방법 */
		/* getTime() : 1970년 1월 1일 0시 0분 0초 이후 지난 시간을 millisecond로 계산해서 long 타임으로 반환하다.*/
		System.out.println(today.getTime());
		
		java.util.Date time = new java.util.Date(1674097411816L);
		System.out.println(time);
		
	}

}
