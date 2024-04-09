package com.kh.conditionEx;

import java.util.Scanner;

public class ControlSwitchIf {

	public static void takeAtaxi() {
		//입력받은 돈이 3000원 이상일 경우에만 택시를 탈 건지 물어봄
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 보유하고 있는 금액을 입력하세요 : ");
		int money = sc.nextInt();
		
		//if 문을 사용해서 금액이 3000원이상일 경우에만 물어보는 코드
		if(money >= 3000) {
			System.out.println("택시를 타시겠습니까?(예/아니오)");
			String answer = sc.next();
			
			//answer로 받은 대답에 따라 응답처리하기
			switch(answer) {
			case "예":
				System.out.println("택시를 탑니다.");
				break;
			case "아니오":
				System.out.println("택시를 타지 않습니다.");
				break;
				
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}else{
			System.out.println("잔액이 부족합니다.");
		
		}
			
		
	}
	
	/*
	 * public static void whyScore()
	 
	 사용자로부터 점수를 입력받아 성적 등급을 판별하는 프로그램 작성
	 if문
	 점수가
	 90 이상 A
	 80 이상 B
	 70 이상 C
	 60 이상 D
	 60 미만 F
	 
	 switch문
	 F학점일 때 재수강하시겠습니까(yes/no)
	 Yes/No 이외 값이 나올 수 있기 때문에
	 case YES: case yes: 두개 할것.
	 
	 */
	public static void whyScore() {
		System.out.print("점수를 입력하세요 : ");
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		sc.nextLine();//공백제거
		
		char grade; 
		
		if(score < 60) {
			grade = 'F';
			
			System.out.print("재수강 하시겠습니까?(yes/no):");
			
			String reScore = sc.nextLine();//nextLine쓰면위에공백제거필요,next는그냥.
			
			switch(reScore) {
			case "yes": case "YES":
				System.out.println("재수강합니다.");
				break;
			case "no": case "NO":
				System.out.println("재수강하지않습니다.");
				break;
				
			}
			return;
			
		}else if(score < 70) {
			grade = 'D';
		}else if(score < 80) {
			grade = 'C';
		}else if(score < 90) {
			grade = 'B';
		}else {
			grade = 'A';
		}
		
		System.out.println("학점 : " + grade);
		
	}
	
	/*
	 public static void whatDay()
	 월 수 금 : 헬스
	 화 목 : 공부
	 토 일 : 주말인데 집에서 쉴 예정입니까? (예/아니오)
	 예 - 집에서 쉴 예정입니다.
	 아니오 - 어떤활동을 할 예정인지 선택해주세요
	 	1.등산 2.독서 3.수영
	 
	 */
	public static void whatDay() {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일을 입력하세요:");
		String day = sc.next();
		
		String activity; // String activity = ""; //이렇게 처리해놓으면 밑에 activity없는 부분으로 인한 오류안생김.
		switch(day) {
			case "월": case "수": case "금":{
				activity = "헬스";
				break;
			}
			case "화": case "목":{
				activity = "공부";
				break;
			}
			case "토": case "일":{
				System.out.print("주말인데 집에서 쉴 예정입니까?(예/아니오):");
				String homeQuestion = sc.next();
				switch(homeQuestion) {//2중첩 스위치
					case "예":{
						activity = "집에서 쉼.";
						break;//예case break
					}
					case "아니오":{//밑에 너무 길어져서 괄호침.
						System.out.println("어떤 활동을 할 예정인지 선택해주세요:");
						System.out.println("1.등산 2.독서 3.수영");
						int choiceWeekend = sc.nextInt();
						
						//String choiceResult;//switch아래에 넣으면오류나는듯.
		
						switch(choiceWeekend) {//3중첩 스위치
							case 1:{
								activity = "등산";
								break;
							}
							case 2:{
								activity = "독서";
								break;
							}
							case 3:{
								activity = "수영";
								break;
							}
							default :
								//System.out.println("잘못된 주말활동 선택입니다. 123만 입력하세요.");//에러1밑에따로처리
								activity = "error123";
						}
						
						break;//아니오case break
					}
				
					default:{//예 아니오 이외
						//System.out.println("예 아니오만 입력하세요.");//에러2밑에따로처리
						
						//return;아예나가버려서 사용하지말자.
						
						activity = "errorYesNo";
					}
				}//2중첩스위치종료
				
			break;	
			}//토,일case종료
			
			default:
				//System.out.println("잘못된 요일 입력입니다.");//에러3밑에따로처리
				activity ="errorDay";
				
		
		}//요일 스위치 종료
			
		//요일에 따른 최종 활동출력
		switch(activity) {
		case "error123":
			System.out.println("잘못된 주말활동 선택입니다. 123만입력하세요.");
			break;
		case "errorYesNo":
			System.out.println("잘못된 입력입니다. 예 아니오만 입력하세요.");
			break;
		case "errorDay":
			System.out.println("잘못된 요일 입력입니다.월~일 만입력하세요.");
			break;
		default:
			System.out.println(day + "요일에 " + activity + " 할 예정입니다.");
			
		}
		
		
	}//메서드종료
		
	
	public static void main(String[] args) {

		//takeAtaxi();
		//whyScore();
		whatDay();
		
		
	}

}
