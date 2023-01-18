package com.greedy.section01.object.run;

import com.greedy.section01.object.book.Book;

public class Application {

	public static void main(String[] args) {

		/* Object 클래스의 관례 용법 
		 * toString() 메소드 오버라이딩
		 * */
		Book book1 = new Book(1, "홍길동전", "허균",50000);
		Book book2 = new Book(2, "묵민심서","정약용",30000);
		Book book3 = new Book(3, "목민심서","정약용",30000);
		
		/* toString() : 인스턴스가 생성된 타입의 full class name과 @ 16 진수 주소값이 문자열로 반환된다.*/
		System.out.println("book1.toString() : "+ book1.toString());
		System.out.println("book2.toString() : " + book2.toString());
		System.out.println("book3.toString() : " + book3.toString());
		
		/* 출력 구문에서 레퍼런스 변수만 선언하면 toString()을 컴파일러가 자동으로 붙여서 호출하게 된다.*/
		System.out.println("book1 : " + book1);
		System.out.println("book2 : " + book2);
		System.out.println("book3 : " + book3);
	}

}
