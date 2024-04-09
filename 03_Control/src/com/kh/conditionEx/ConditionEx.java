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
		
		String str;
		if(age >= 19)
			str="19세 이상은 성인입니다.";
		else
			str="성인이 아닙니다.";
		
		System.out.println(str);
		
		
	}
	
	public static void method2() {
		int num = 2;
		
		// 만약에 num이 짝수일 경우 짝수입니다. 출력하기
		//num이 홀수일 경우 홀수입니다. 출력하기
		String str;
		if(num % 2 == 0) // c에서 if(!(num%2)) -> 짝수라면 if(!0) -> if(1)처리
			str="짝수입니다.";
		else
			str="홀수입니다.";
		
		System.out.println(str);
			
	}
	
	public static void method3() {
		//나이 0~13 어린이
		int age = 14;
		//1. 범위 0보다 커야함,14보다 작아야함
		//14부터는 어린이가 아닙니다.
		
		String str;
		if(age > 0 && age < 14)
			str = "어린이입니다.";
		else
			str = "어린이가 아닙니다.";
		
		System.out.println(str);
	}
	
	//실습 : Scanner 활용해서 진행하기
	public static void method4() {
		// 나이가 10세 이상 20세 미만일 때는 10대
		//이 외에는 10대가 아님 출력
		System.out.println("나이 입력 :");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		String str;
		
		if(age >= 10 && age < 20)
			str = "10대 입니다.";
		else
			str = "10대가 아님.";
		System.out.println(str);
		
	}

	public static void method5() {
		// 나이가 80세 이상이면 80세 이상입니다. 출력하기
		System.out.println("나이 입력 :");
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		String str;
		if(age >= 80)
			str = "80세 이상입니다.";
		else
			str ="80세 이상이 아닙니다.";
		
		System.out.println(str);
	}
	
	/*
	 메소드 명 : public void practice1(){}
키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
짝수가 아니면 “홀수입니다.“를 출력하세요.
양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

[실행 화면 1]
숫자를 한 개 입력하세요 : 8
짝수입니다.

[실행 화면 2]
숫자를 한 개 입력하세요 : 17
홀수입니다.

[실행 화면 3]
숫자를 한 개 입력하세요 : -3
양수만 입력해주세요.

*/
	
	public static void practice1() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String str;
		
		if(num <= 0)
			str = "양수만 입력해주세요.";
		else if(num % 2 == 0)
			str = "짝수입니다.";
		else
			str = "홀수입니다.";
		
		System.out.println(str);
	}
	/*
메소드 명 : public void practice2(){}
국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
불합격인 경우에는 “불합격입니다.”를 출력하세요.

[실행화면 1] [실행화면 2]
국어점수 : 88 국어점수 : 88
수학점수 : 50 수학점수 : 50
영어점수 : 40 영어점수 : 45
불합격입니다. 국어 : 88
수학 : 50
영어 : 45
합계 : 183
평균 : 61.0
축하합니다, 합격입니다!
	 */
	public static void practice2() {
		
		System.out.print("국어점수 : ");
		Scanner sc = new Scanner(System.in);
		int korean = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int total = korean + math + english;
		double average = total / 3.0;
		
		String result;
		if(korean >= 40 && math >= 40 && english >= 40 && average >= 60) {
			System.out.println("국어 : " + korean);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + english);
			System.out.println("합계 : " + total);
			System.out.println("평균 : " + average);
			
			result = "축하합니다, 합격입니다!";
		}
		else
			result = "불합격입니다.";
		System.out.println(result);
	}
	
	
	/*
	 메소드 명 : public void practice3(){}
1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

[실행화면 1]
1~12 사이의 정수 입력 : 8
8월은 31일까지 있습니다.
[실행화면 2]
1~12 사이의 정수 입력 : 99
99월은 잘못 입력된 달입니다.
	 
	 */
	
	/*
	 
	 메소드 명 : public void practice4(){}
키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
저체중/정상체중/과체중/비만을 출력하세요.

BMI = 몸무게 / (키(m) * 키(m))
BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
BMI가 30이상일 경우 고도 비만

[실행 화면]
키(m)를 입력해 주세요 : 1.65
몸무게(kg)를 입력해 주세요 : 58.4
BMI 지수 : 21.45087235996327
정상체중
	  */
	public static void practice4() {
		System.out.print("키(m)를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		String result;
		
		if(bmi < 18.5) 
			result = "저체중";
		else if(bmi < 23)
			result = "정상체중";
		else if(bmi < 25)
			result = "과체중";
		else if(bmi < 30)
			result = "비만";
		else
			result = "고도비만";
		
		System.out.println(result);
		
	}
	
	/*
	 
	 메소드 명 : public void practice5(){}
중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

[실행 화면 1]
중간 고사 점수 : 80
기말 고사 점수 : 30
과제 점수 : 60
출석 횟수 : 18
================= 결과 =================
중간 고사 점수(20) : 16.0
기말 고사 점수(30) : 9.0
과제 점수 (30) : 18.0
출석 점수 (20) : 18.0
총점 : 61.0
Fail [점수 미달]


[실행 화면 2]
중간 고사 점수 : 80
기말 고사 점수 : 90
과제 점수 : 50
출석 횟수 : 15
================= 결과 =================
중간 고사 점수(20) : 16.0
기말 고사 점수(30) : 27.0
과제 점수 (30) : 15.0
출석 점수 (20) : 15.0
총점 : 73.0
PASS

[실행 화면 3]
중간 고사 점수 : 100
기말 고사 점수 : 80
과제 점수 : 40
출석 횟수 : 10
================= 결과 =================
Fail [출석 횟수 부족 (10/20)]

	  */
	
	public static void practice5() {
		System.out.print("중간 고사 점수 : ");
		Scanner sc = new Scanner(System.in);
		int midScore = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int finScore = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int quizScore = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int attendance = sc.nextInt();
		
		System.out.println("================= 결과 =================");

		
		final int attFull = 20;	//전체수업일수
		
		final int attMin = attFull - attFull * 3 / 10;	//초과해야되는 최소출석일
		
		//출석횟수 부족하면 점수출력 필요없이 바로 fail
		if(attendance <= attMin) {
			System.out.println("Fail [출석 횟수 부족 (" + attendance +
					"/" + attFull +")]");
			
			//출석횟수 만족하면 계산시작.
		}else {
			double midTo20Per = midScore * 0.2;
			double finTo30Per = finScore * 0.3;
			double quizTo30Per = quizScore * 0.3;
			
			double total = midTo20Per + finTo30Per + quizTo30Per + attendance;
			
			//비율 계산된 점수,합 출력
			System.out.println("중간 고사 점수(20) : " + midTo20Per);
			System.out.println("기말 고사 점수(30) : " + finTo30Per);
			System.out.println("과제 점수(30) : " + quizTo30Per);
			System.out.println("출석 점수(20) : " + attendance);
			System.out.println("총점 : " + total);
			
			
			if(total >= 70) {
				System.out.println("PASS");
			}else {
				System.out.println("Fail [점수 미달]");
			}
			
		
		
		
		}
		
	}
	
	//최종메서드
	public static void main(String[] args) {

		//method1();
		//method2();
		//method3();
		
		//method4();
		//method5();
		
		//practice1();
		//practice2();
		
		//practice4();
		
		practice5();
		
		
		
		
	}

}
