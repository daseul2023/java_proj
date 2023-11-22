package chap2.ex03;

public class TypeCasting {

	public static void main(String[] args) {
		/* TypeCasting : 자료형의 형식을 변환
		 
		 기본 자료형 8가지 : RAM(메모리) : Stack 공간에 변수명, 값
		 byte < short/char < int < long < float < double
		 
		 
		 참조 자료형, 무한대로 생성(객체) : Stack 공간 <- 변수명(값이 위치한 참조 주소), Heap : 변수에 할당하는 값
		      객체/배열/인터페이스 
		      
		      -- 자동으로 캐스팅 : 업캐스팅 (낮은 자료형에서 높은 자료형으로 자동으로 일어남)
		      -- 수동으로 캐스팅 : 다운캐스팅 (높은 자료형 -> 낮은 자료형)
		                       명시해야 됨 
		      
		      연산을 할 때 Type 이 정확해야한다.
		 
		 */
		
		// 1. 자동 캐스팅 : 업캐스팅
		int a = 10;
		double b = 20.55;
		
		// 자동으로 업캐스팅
		System.out.println(a + b);  // a (int) + b (double) <- int가 자동으로 double 타입으로 캐스팅됨
		
		// 수동으로 다운캐스팅 : 명시해야함.
		System.out.println( (int)(a + b) );  // double
		System.out.println();
		
		// 변수의 값을 할당 할 때
		double c = (double)100;  // 정수가 자동으로 업캐스팅 되어서 double 변수에 할당 됨.
		
		int d = (int)200.5;           // 실수를 다운캐스팅해서 정수 변수에 할당해야함.
		
		System.out.println(c);
		System.out.println(d);
		

	}

}
