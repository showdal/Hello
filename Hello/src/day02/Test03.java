package day02;


/*
 	오늘 날짜를 출력하는데
 	날짜에 해당하는 데이터는 정수형 변수에 담아서 출력해 보세요.
 	
 	참고]
 		정수형 변수 만드는 방법
 			형식 1]
 				int 변수이름;	  // 변수 선언
 				변수이름 = 데이터; // 변수 초기화
 				
 			형식2]
 				int 변수이름 = 데이터; // 변수 선언 & 변수 초기화
 		
 		***
 		변수 만드는 형식
 		
 			데이터타입		변수이름=데이터;
 			
 			예]
 				1. 문자
 					char ch = 'A';
 				
 				2. 논리값
 					boolean bool = true;
 				
 				3. 정수
 					int no = 7;
 					
 				4. 실수
 					double val = 3.14;
 				
 				5. 문자열 : 문자열은 기본형 타입은 아니지만
 						   빈번히 사용되는 데이터이기 때문에
 						   자바에서 편의를 제공해주고 있다.
 							
 						a. 	String str1 = "abcd";
 						b.	String str2 = new String("abcd");
 					
 			변수 작성 형식
 			
 				[접근지정자] [속성] 데이터타입 변수이름 = 데이터;
 				
 */

public class Test03 {
		// 문자열 변수
		static String msg = "내일은 ";
		static int month = 2;
		static int day = 12;
	
		int num1 = 100;
		int num2 = 500;
		
	public static void main(String[] b) {
		
		System.out.println(msg + month + "월 " + day + "일 입니다.");
	}
	
	/*
		class2라는 단어와 Teacher를 결합해서 변수의 이름을 만들 경우
		
			1. camel 표기법
				String class2Teacher = "전은석";
				
			2. snake 표기법
				String class_teacher = "전은석";
	 * 
	 */
	
	
}






