package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionEx2 {

	/*
	 if - else if - else
	 사용방법
	 if(조건1) {
	 	조건1이 참일 경우 실행할 코드 작성
	 } else if(조건2) {
	 	조건1이 거짓이고
	 	조건2가 참일 경우 실행할 코드 작성
	 } else {
	 	조건1과 조건2가 모두 거짓일 경우 실행할 코드 작성
	 
	 }
	 
	 */
	
	// 만약에 돈이 2000원 이상 있을 경우 택시를 탄다
	//만약에 돈이 1500~1900원 이하 있을 경우 대중교통을 이용한다
	//만약에 돈이 없을 경우 걸어간다.
	public static void method1() {
		int money = 1950; // 내가 현재 가지고 있는 돈
		
		if(money >= 2000) {
			System.out.print("택시를 탄다");
		}else if(money >= 1500 && money <= 1900) {
			System.out.println("대중교통을 이용한다");
		}else {
			System.out.println("걸어간다");
		}
	
	}
	
	/*
	 나이를 입력받아
	 13세 이하면 "어린이"
	 13세 초과 18세 이하 "청소년"
	 18세 초과 "성인"
	 
	 */
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("안녕하세요. kh티켓나라입니다.");
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이");
		}else if(age <= 18) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
	}
	
	
	/*
	 달을 입력받아 해당하는 계절 출력하기
	 
	 */
	
	public static void method3() {
		System.out.print("달을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		if(month>=3 && month<=5) {//(month==3 || month==4 || month==5)
			System.out.println("봄");
		}else if(month >= 6 && month <= 8) {
			System.out.println("여름");
		}else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}

	public static void main(String[] args) {
		//method1();
		//method2();
		
		method3();
	}

}
