package chap04.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) {
		/*
	     while 문 : 조건이 true 일 때 실행문이 실행됨
	     do while 문 : 조건에 상관없이 한번은 실행문이 실행됨
	     
	     ==============while 문================
	     초기값;
	     while (조건){
	         실행문;      <- 조건이 true
	         증감식;
	     }
	     ===============do while 문============
	     초기값;
	     do {
	         실행문;
	         증감식;
	      }while (조건);           <- ;이 붙는다 주의할 것!!
	     ====================================== 
	 */
	
	// while 문
	int a = 0;
	while (a < 0) {                          // 조건이 false 이므로 아래 내용이 출력이 안됨
		System.out.println("a : " + a);      // 작동이 안됨
	}
	
	// do ~ while (조건);
	int b = 0;
	do {
		System.out.println("b : " + b);      // 조건과 상관없이 1번은 반드시 작동이 됨
	}while (b < 0);                          // 조건이 false 여도 작동이 됨
    
	// do ~ while 에서 반복 처리
	int c = 0;
	do {
		System.out.println("c : " + c);
		c++;
	}while (c < 100);
	
	System.out.println("===================================");
	
	// 반복 횟수가 100번인 경우 while 문, do while 문의 비교 
	
	System.out.println("=========while=======");
	
	a = 0;
	while(a<10) {
		System.out.println("a : "+ a);
		a++;
	}
	
	System.out.println("=========do while=======");
	a= 0;
	do {
		System.out.println("a : " + a);
		a++;
	}while(a<10);

	}

}
