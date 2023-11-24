package chap04.ex03;

public class For_Statement {

	public static void main(String[] args) {
		/*
		       제어문 : 프로그램의 조건에 따라서 순서를 바꿔줌, if (if, if ~ else, if else if), switch
		       반복문 : 프로그램을 계속 반복하도록 하는 구문
		          주의 : 조건이 무한 루프에 빠지지 않도록 처리
		          for, while, do while
		          
		          for (변수의 초기값; 조건; 증감식) {
		               // 반복될 구문;
		          }
		 */
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("오늘 날씨는 춥습니다 : " + i);
		}
		
		System.out.println("============================");
		// for 문에서 주의 : 무한루프에 빠지지않도록 조건을 처리
		int a; // 블락 밖에서 선언된 변수 
	//	for (a = 0; a >= 0; a++) {           // 조건이 계속 true여서 무한루프에 빠짐.
		for (a = 0; a < 100; a++) {          
			System.out.println(a);
		}
		
		System.out.println("=============================");
		// for 문 블락에 밖에서 선언, for 문 블락 내에서 선언 (변수를 새로 사용 가능)
		for (a = 10; a <= 100; a+=2) {       // 블락 밖에서 int a;가 선언됐기 때문에 블락 내에서 int a;로 설정하면 오류남
			System.out.println(a);
		}
		System.out.println("마지막 a 변수의 값을 출력 : " + a);  // 102, false가 되면서 블락을 빠져나온 값이 출력된다.
		
		// System.out.println("마지막 i 변수의 값을 출력 : " + i);  // for 문 블락내에서 초기화, 블락 밖에서는 오류 발생.
		
		System.out.println("=========무한루프=========");
		
	//	for (int i = 0; i >= 0; i++) {               // 무한 루프 
		for (int i = 0; i < 100; i++) {              // 정상 코드
			System.out.println("무한루프 : " + i);
		}
		
	//	for (int i = 0; true; i++) {                 // 무한 루프2
		for (int i = 0; i < 100; i++) {
			System.out.println("무한루프2 : " + i);
		}
		
	//	for (int i = 0; ; i++) {                     // 무한 루프3, 조건이 생략된 경우 : JVM에서 true를 자동으로 넣음.
		for (int i = 0; i < 100 ; i++) {
			System.out.println("무한루프3 : " + i);
		}
		
		// 도달 할 수 없는 코드
//		for (; false;) {
//			System.out.println("a");
//		}
	

	}

}
