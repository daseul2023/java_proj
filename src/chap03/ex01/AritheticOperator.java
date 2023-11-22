package chap03.ex01;

public class AritheticOperator {

	public static void main(String[] args) {
		/*
		        산술 연산자 : +, -, *, / , % (나머지만 출력
		        증감 연산자 : ++ (1씩 증가), -- (1씩 감소)   <- 변수 앞, 변수 뒤
		 */
		
		// 1. 산술 연산자
		int a = 5;
		int b = 10;
		System.out.println(a + b); // 15
		System.out.println(a - b); // -5
		System.out.println(a * b); // 50
		System.out.println(a / b); // 나누어서 목만 출력, 0
		System.out.println(a % b); // 나머지만 출력, 5     <- 중요!!!
		
		// 캐스해서 연산
		System.out.println( 2 + (double) 3 );         // 5.0
		//
		System.out.println(10%5); // 나머지만 출력 : 
		   // 값 % 3 = 0일 때 값은 3의 배수
		   // 값 % 5 = 0일 때 값은 5의 배수
		
		System.out.println(8 / 5);  // 목만 출력,
		System.out.println( (int)(8 / 5.0)  );  // 목만 출력,
		System.out.println( 8 % 5);   // 나머지만 출력
		System.out.println( 8 / 5.0);
		System.out.println("=================================");
		
		
		// 2. 증감 연산자 : ++, --
		int va11 = 3;
		System.out.println(++va11);  // 4 , 값을 증가 후 출력
		System.out.println(va11++);  // 4
		System.out.println(va11);
		
		System.out.println(--va11);  // 3
		System.out.println(va11--);  // 3
		System.out.println(va11);    // 2
		System.out.println("==============================================");
		
		int va12 = 3;
		System.out.println(va12++);  // 3 , 값을 출력 후 증가
		System.out.println(va12);    // 4
		int va17 = 3;
		int va18 = 4;
		int va19 = 2 + va17-- + ++va18;    // 2 + 3 + 5  -> 10 
		
		System.out.println("va19 : " + va19);   //10
		System.out.println("va17 : " + va17);   //2
		System.out.println("va18 : " + va18);   //5
		
		System.out.println("==================================");
		int va110 = 30;
		int va111 = 40;
	    int va112 = 50;
	    
	    int va113 = 7 + --va110 + ++va111 + va112--;    // 7 + 29 + 41 + 50 (나중에 -찍혀서 연산됨) = 127
	    
	    System.out.println("va113 : " + va113);
	    System.out.println(va110);  //29
	    System.out.println(va111);  //41
	    System.out.println(va112);  //49
	    
			
		

	}

}
