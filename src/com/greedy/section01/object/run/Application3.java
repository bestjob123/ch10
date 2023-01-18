package com.greedy.section01.object.run;

import java.util.HashMap;
import java.util.Map;

import com.greedy.section01.object.book.Book;

public class Application3 {

	public static void main(String[] args) {

		/* Object 클래스의 명세에 작성된 일반적인 규약에 따르면
		 * equals() 메소드를 재정의 하는 경우 반드시 hashcode() 메소드도 재정의하도록 되어있다.
		 * 만약 hashcode()를 재정의 하지 않으면 같은 값을 가지는 동등객체는
		 * 같은 헤시코드값을 가져야 한다는 규칙에 위반되게 된다.(강제성이 없기는 함)
		 * */
		Book book1 = new Book(1,"홍길동전","허균",50000);
		Book book2 = new Book(2, "홍길동전","허균",50000);
		
		System.out.println("book1의 hashCode(): "+ book1.hashCode());
		System.out.println("book2의 hashCOde() :" + book2.hashCode());
	
		/*--------------------------------------------------------------*/
		Map<Book, String> map = new HashMap<>();
		map.put(new Book(1,"홍길동전","허균",50000), "selled");
		String str = map.get(new Book(1,"홍길동전","허균",50000));
		System.out.println(str);
	}

}
