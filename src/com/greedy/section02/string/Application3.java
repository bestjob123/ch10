package com.greedy.section02.string;

import java.util.StringTokenizer;

public class Application3 {

	public static void main(String[] args) {

		/* split() */
		
		/* 사번/ 이름 / 주소/ 부서이름 의미한다.*/
		String emp1 = "100/홍길동/서울/영업부";
		String emp2 = "200/유관순//총무부";
		String emp3 = "300/이순신/경기도/";
		
		String[] empArr1 = emp1.split("/");
		String[] empArr2 = emp2.split("/");
		String[] empArr3 = emp3.split("/");
		
		for(int i = 0;i<empArr1.length;i++) {
			System.out.println("empArr1["+i+"]"+empArr1[i]);
		}
		for(int i = 0;i<empArr2.length;i++) {
			System.out.println("empArr2["+i+"]"+empArr2[i]);
		}
		for(int i = 0;i<empArr3.length;i++) {
			System.out.println("empArr3["+i+"]"+empArr3[i]);
		}
		/* 마짖막 구분자 사이에 값이 존재하지 않는 경우 이후 값도 추출하고 싶을때
		 * 몇 개의 토큰으로 분리할 것인지 한계치를 두번째 인자로 넣어줄 수 있다.
		 * 이 때 음수를 넣게 되면 마지막 구분자 뒤의 값이 존재하지 않는 경우 빈 문자열로 토큰을 생성한다.
		 * */
		String[] empArr4 = emp3.split("/",2);
		for(int i=0; i<empArr4.length;i++) {
			System.out.println("empArr4["+i+"] :"+empArr4[i]);
		}
		/* StringTokenizer 클래스
		 * 공백으로 존재하는 토큰은 무시한다. */
		StringTokenizer st1 = new StringTokenizer(emp1,"/");
		StringTokenizer st2 = new StringTokenizer(emp2,"/");
		StringTokenizer st3 = new StringTokenizer(emp3,"/");
		
		while(st1.hasMoreTokens()) {
			System.out.println("st1:" + st1.nextToken());
		}

		/* nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰으르 재사용하는 것이 불가능하다.*/
//		while(st1.hasMoreTokens()) {
//			System.out.println("st1:" + st1.nextToken());
//		}
	
		while(st2.hasMoreTokens()) {
			System.out.println("st2 :"+ st2.nextToken());
		}
		while(st3.hasMoreElements()) {
			System.out.println("st3:"+ st3.nextElement());
		}
		/* split()은 정규표현식 이용(문자열 패턴) */
		String colorStr = "red*orange#blue/yellow green";
		
//		String[] colors = colorStr.split("*#/ ");
		String[] colors = colorStr.split("[*/# ]");
		
		for(int i =0;i<colors.length;i++) {
			System.out.println("colors["+i+"]:"+colors[i]);
		}
		StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr,"*#/ ");
		
		while(colorStringTokenizer.hasMoreTokens()) {
			System.out.println(colorStringTokenizer.nextToken());
		}
	}

}
