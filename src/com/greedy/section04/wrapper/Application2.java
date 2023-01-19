package com.greedy.section04.wrapper;

public class Application2 {

	public static void main(String[] args) {

		/* parsing : 문자열(String)값을 기본 자료형 값으로 벼ㅑㄴ경하는 것을 parsing이라고 한다.
		 * */
		int inum = Integer.parseInt("4");
		System.out.println(inum+1);
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("4");
		long l = Long.parseLong("8");
		float f = Float.parseFloat("4.0f");
		double d = Double.parseDouble("8.0");
		boolean bl = Boolean.parseBoolean("TRUE");

		System.out.println(bl);
	}

}
