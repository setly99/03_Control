package com.kh.conditionEx;

public class ConditionEx3 {
	/*
	 if문으로 정수,실수,문자열 문자 등 모든 것을 비교할 수 있음.
	 
	 대표적으로 정수비교,문자열 비교 있음
	 
	 정수비교
	 	if(숫자 == 숫자){
	 		숫자와 숫자가 같을 때 실행할 출력문
	 	}
	 
	 문자열 비교
	 	if(문자열.equals("문자열")){
	 		문자열과 문자열이 같을 때 실행할 코드
	 	}
		 
	 
	 */
	
	

	public static void main(String[] args) {
		//정수 비교
		int number = 10;
		if(number == 10) {
			System.out.println("숫자가 동일합니다.");
			
		}
		/*
		문자열을 String에 넣어준다면 문자열 큰따옴표를 붙여서 적지 않고 지정해준 변수명을 적어줌
		String str = "문자열";
		if("문자열".equals(str)){
		 	sysout("문자열이 동일");
		 	}
		 if(str.equals("문자열")){
		 	sysout("문자열이 동일");
		 }
		
		*/
		//문자열 비교
		String str = "hello";
		//만약에 두 문자열이 같다면
		if(str.equals("hello")) {
			System.out.println("두 문자열이 같습니다.");
		}
		
		String str1 = "둘";
		
		String str2 = "";
		
		if("둘".equals(str1)) {
			System.out.println("두 문자열이 같습니다.");			
		}

		
		
	}

}
