package chap2.ex02;

public class RangeOfVariable {
	public static void main(String[] args) {
		// main 메소드 : 코드 작성
		       // 메소드 : 객체지향언어에서 함수를 메소드라고 호칭함.  메소드 == 함수
		
		// 변수의 사용 범위 : 전역 변수, 지역 변수 
		
		// 전역 변수 : 선언된 곳에서만 유효
		int a = 10;
		
		{      // if, switch, for, while, do ~ while   <- 제어문, 반복문
			 // 지역 변수 (블락내에서의 선언) : 그 블락 내에서만 사용됨, 블락 밖에서는 사용할 수 없음
			int b = 20;
			
			System.out.println("a 변수의 값을 출력(내부 블락) : " + a);
			System.out.println("b 변수의 값을 출력 (내부 블락) : " + b);
			
			{
				int c = 30;
				System.out.println("==========================");
				
				System.out.println("블락의 블락 a : " + a) ;
				System.out.println("블락의 블락 b : " + b) ;
				System.out.println("블락의 블락 c : " + c) ;
				
				System.out.println("==========================");
			}
	//		System.out.println("블락의 블락 c : " + c) ;
			
			
		}
		
		System.out.println("a 변수의 값을 출력(외부 블락) : " + a);
	//	System.out.println("b 변수의 값을 출력 (외부 블락) : " + b);
	
		
	
	}

}
