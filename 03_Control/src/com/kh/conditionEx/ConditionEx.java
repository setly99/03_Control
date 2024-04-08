package com.kh.conditionEx;

import java.util.Scanner;

//패키지 : 작성한 파일의 폴더 위치
/*
 
 조건문 기능용 클래스
 */
public class ConditionEx {
	/*
	 if 주어진 조건이 참일 때 실행되는 코드 블록
	 
	 */
	
	//메서드1 : 19세 이상은 성인입니다. 출력하기
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if(age >= 19)
			System.out.println("19세 이상은 성인입니다.");
	}
	
	
	//최종메서드
	public static void main(String[] args) {

		method1();
		
		
	}

}
