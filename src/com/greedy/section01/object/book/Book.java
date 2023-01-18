package com.greedy.section01.object.book;

public class Book {

	private int number;			//책번호
	private String title;		//책제목
	private String author;		//저자
	private int price;			//책가격
	public Book() {}
	public Book(int number, String title, String author, int price) {
		super();
		this.number = number;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "toString() 호출됨....";
//	}
//	
	@Override
	public String toString() {
		return "Book [number=" + number + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public boolean equals(Object obj) {
		/*두 인스턴스의 주소값이 같으면 이후 다른 내용을 비교할 것 없이 true 이다.*/
		if(this==obj) {
		return true;
	}
		/* this는 인스턴스가 생성되면 주소값이 저장된다. (null알 수 없다)
		 * 따라서 매개변수로 전달받은 값이 null 인 경우 두 객체는 이후 내용을 비교할 필요 없이 다른 객체이다.
		 * */
		if(obj == null) {
			return false;
		}
		/* Object 타입 레퍼런스 변수로는 Book의 멤버에 접근이 불가능하기 떄문에 형변환 처리 한다.*/
		Book other = (Book)obj;
		/*모든 필드를 각각 같은지 비교한다.*/
		if(this.number != other.number) {
			return false;
		}
		if(this.title == null) {
			if(other.title != null) {
				return false;
			} 
		} else if(!this.title.equals(other.title)) {
			return false;
		}
		
		if(this.author == null) {
			if(other.author !=null) {
				return false;
			}
		}else if (!this.author.equals(other.author)) {
			return false;
		}
		if(this.price != other.price) {
			return false;
		}
		/* 모든 필드가 같은 상황인 경우 true*/
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		
		final int PRIME = 31;
		
		result = PRIME * result + this.number;
		result = PRIME * result + this.title.hashCode();
		result = PRIME * result + this.author.hashCode();
		result = PRIME * result + this.price;
		
		return result;
	}
}
