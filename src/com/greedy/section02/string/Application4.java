package com.greedy.section02.string;

public class Application4 {

	public static void main(String[] args) {

		/* 이스케이프(escape)) 문자 */
		
		/* 개행문자 */
		System.out.println("안녕하세요. \n저는 홍길동입니다.");
		
		/* 탭 문자 */
		System.out.println("안녕하세요. \t저는 홍길동입니다.");
		
		/* 큰따옴표 문자 */
		System.out.println("안녕하세요. 저는 '홍길동'입니다.");
		System.out.println('\'');
		
		/* 쌍따옴표 문자 */
		System.out.println("안녕하세요. 저는 \"홍길동\"입니다.");
		
		/* 역슬러쉬 문자 */
		System.out.println("안녕하세요. 저는 \\\\홍길동\\\\입니다.");
		
		/* split 시 이스케이프 문자를 사용해야 하는 특수문자
		 * 
		 * 이스케이프 문자 사용 안하는 특수문자
		 * ~ ` ! @ # $ % & - _ = ; : ' \ " , > ? / 
		 * 
		 * 이스케이프 문자 사용하는 특수문자
		 * $ ^ * ( ) + | { } [ ] . ?
		 * */
		
		String str = "java/oracle/jdbc";
		String[]sarr = str.split("/");
		
		for(String s : sarr) {
			System.out.println(s);
		}
	}

}
