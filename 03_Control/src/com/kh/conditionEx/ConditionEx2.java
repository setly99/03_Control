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
		if(month <= 0) {
			System.out.println("해당 달은 없습니다.");
		}else if(month>=3 && month<=5) {//(month==3 || month==4 || month==5)
			System.out.println("봄");
		}else if(month == 12 || month == 1 || month == 2){
			System.out.println("겨울");
		}else if(month <= 8) {
			System.out.println("여름");
		}else if(month <= 11) {
			System.out.println("가을");
		}else {
			System.out.println("해당 달은 없습니다");
		}
	}
	
	public static void method4() {
		//13세 이하 어린이 ,14~18세 청소년, 19세이상 성인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		/*
		if(age <= 13) {
			System.out.println("어린이");
		}else if(age <= 18) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		*/
		
		//변수의 기능을 활용해서 마지막에 나이에 따른 표기를 출력
		String result;
		if(age <= 13) {
			result = "어린이";
		}else if(age <= 18) {
			result = "청소년";
		}else {
			result = "성인";
		}
		
		System.out.println(result + "입니다.");
		
	}
	
	public static void method1_result() {
		
		int money = 1950; // 내가 현재 가지고 있는 돈
				
		
		String result;
				if(money >= 2000) {
					result = "택시를 탄다";
				}else if(money >= 1500 && money <= 1900) {
					result = "대중교통을 이용한다";
				}else {
					result = "걸어간다";
				}
				
				System.out.println(result);
	
		
	}
	
	public static void method2_result() {
		Scanner sc = new Scanner(System.in);
		System.out.print("안녕하세요. kh티켓나라입니다.");
		System.out.print("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		
		String result;
		if(age <= 13) {
			result ="어린이";
		}else if(age <= 18) {
			result = "청소년";
		}else {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	public static void method3_result() {
		System.out.print("달을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		String result;
		
		if(month <= 0) {
			result = "해당 달은 없습니다.";
		}else if(month>=3 && month<=5) {//(month==3 || month==4 || month==5)
			result ="봄";
		}else if(month == 12 || month == 1 || month == 2){
			result = "겨울";
		}else if(month <= 8) {
			result = "여름";
		}else if(month <= 11) {
			result = "가을";
		}else {
			result = "해당 달은 없습니다";
		}
		
		System.out.println(result);
	}
	
	public static void method100_grade() {
		System.out.print("학점확인을위해 점수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		char grade;
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.println("학점 : " + grade);
	}

	public static void main(String[] args) {
		//method1();
		//method2();
		
		//method3();
		
		//method4();
		
		//method1_result();
		//method2_result();
		//method3_result();
		
		method100_grade();
	}

}
