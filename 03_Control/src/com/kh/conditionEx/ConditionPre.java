package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionPre {

	/*public static void method1(){
	 	// if 문 활용하여 숫자 값 2개를 받아서 숫자 두개가 일치하는지 확인
	 	 Scanner sc = new Scanner(System.in);
	 	 int num1 = sc.nextInt();
	 	 int num2 = sc.nextInt();
	 	 같다면 같습니다 출력하고
	 	 같지 않다면 같지 않습니다 출력하기
	 	 
	 	 method2 - 문자 2개 일치하는지확인
	 	 
	 	 method3 - double로 실수 2개 일치하는지확인
	  
	 */
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 == num2)
			System.out.println("두 정수가 같습니다.");
		else
			System.out.println("두 정수는 같지 않습니다.");
		
	}
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열1 입력 : ");
		String str1 = sc.nextLine();
		
		System.out.print("문자열2 입력 : ");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) 
			System.out.println("두 문자열이 같습니다.");
		else
			System.out.println("두 문자열이 다릅니다.");

		
	}
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 실수를 입력하세요 : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		if(num1 == num2)
			System.out.println("두 실수가 같습니다.");
		else
			System.out.println("두 실수가 다릅니다.");
		
	}
	
	//최종으로 실행할 메인 메서드
	public static void main(String[] args) {

		//method1();
		method2();
		//method3();
		
		
	}

}
