package chap01;
// 패키지 : 클래스를 관리하는 폴더

public class ConsoleOutPut1 {    // 클래스 블락
	public static void main(String[] args) {   // 메인 메소드 블락 : 클래스 블락 내부
		//메인 메소드 내부에서 코드를 작성  <- 객체를 다루기 전까지
		
		
		//1.System.out.println ();  : 콘솔에 출력 후 라인을 개행 (띄어라)
		
		     // 문자열을 출력 : "출력할 문자열"
		     System.out.println("안녕하세요");
		     
		     // 문자열을 연결해서 출력 :      + : 정수, 실수일때는 덧셈
		                         //    + : 문자열일때는 연결을 뜻함
		     System.out.println("안녕하세요" + " 반갑습니다");
		     
		     //정수, 실수일 때 : + (덧셈)
		     System.out.println(2 + 3); // 정수를 덧셈
		     System.out.println("2" + "3"); // 문자열을 연결
		     
		     //실수 출력
		     System.out.println(10.5 + 20.11); // 실수 덧셈
		     System.out.println("10.5" + 20.11); // 문자열 + 실수 : 연결
		     
		     
		     System.out.println("================");
		     // "문자열", 정수 혹은 실수
		     System.out.println("안녕" + 123 + 456.7);		     
		     System.out.println("안녕" + (123 + 456.7));		     
		     
	

		     // 정수, 실수, "문자열"
		     System.out.println(123 + 456.7 + "안녕");
		     
		     // 변수에 값을 할당 후 출력
		          // 변수 : 메모리에서 값이 변화하는 값을 담을 수 있다.
		          // 변수 선언 :   자료형 변수명 = 값 ;
		     
		     //    = <- 같다는 의미가 아니다, 왼쪽의 변수에 오른쪽의 값을 할당해라
		     //    == <- 같다, 같으면 True 틀리면 False 값을 돌려준다 (리턴) 
		     
		     // 문자열을 담는 변수
		     String str = "안녕" ;
		     
		     // 정수를 담는 변수
		     int a = 10 ;
		     int b = 20 ;
		     

		     // 변수를 출력  : ""를 넣으면 문자열
		     System.out.println(str);
		     System.out.println(a);
		     System.out.println(b);
		     
		     System.out.println("===================");
		     
		     // 문자열과 변수를 연결해서 출력
		     System.out.println("str 변수에 담긴 값 : " + str);
		     System.out.println("a + b = " + ( a + b ));
		     
		     
		     System.out.println("=====print()======");
		   
		//2.System.out.print();     : 콘솔에 출력 후 라인을 개행하지 않음 \n : 라인을 개행, \t : 탭
		     
		     System.out.println("=====println()======");
		     System.out.println("오늘");
		     System.out.println("날씨");
		     System.out.println("맑음");
		     
		     System.out.println("=====print()======");
		     System.out.print("오늘");
		     System.out.print("날씨");
		     System.out.print("맑음");
		     System.out.println();
		     
		     System.out.println("=====print() \n : 엔터======");
		     System.out.print("오늘\n");
		     System.out.print("날씨\n");
		     System.out.print("맑음\n");
		     
		     System.out.println("=====print() \\t : 탭======");
		     System.out.print("오늘\t");
		     System.out.print("날씨\t");
		     System.out.print("맑음\t");
		   
		     
		     System.out.println("=======printf=================");
		     // 문자열과 변수를 출력 시 많이 사용
		//3.System.out.printf();    : 콘솔에 출력 : 출력 문자열 라인의 변수 값을 불러 오도록 함.
		                              // %s : 문자열을 불러 들임, %d : 정수를 불러 들임
                                      // %4, 2f : 실수의 값을 불러들임, 전체 4자리 소수점 이하 2자리 출력 
		     str = "맑음";  // 변수의 값을 재할당
		     a = 50 ;     // 변수의 값을 재할당
		     b = 30 ;
		     
		     // 실수를 넣을 수 있는 자료형
		     double c = 123.4567;    // c 변수에는 실수 값을 넣을 수 있음.
		     
		     // printf(); 를 사용해서 출력
		     System.out.printf("오늘의 날씨는 %s 입니다", str);  // %s는 문자열 변수의 값을 불러들임
		     System.out.println();
		   // println(); 를 사용해서 출력
		     System.out.println("오늘의 날씨는 " + str + " 입니다");
		     
		     System.out.println("======================");
		     
		     //printf(); 를 사용해서 출력  <- 문자열과 변수를 출력 시 간결하게 출력 가능
		     System.out.printf(" 오늘 날씨 : %s \n 변수 a + b : %d \n 실수 c의 값 : %4.2f" , str, (a+b), c);
		     System.out.println("============================");
		     System.out.println();
		     //println(); 을 사용해서 출력  <- 문자열과 변수를 출력 시 코드가 길어짐
		     System.out.println(" 오늘 날씨 : " + str + "\n 변수 a + b : " + (a+b) + "\n 실수 c의 값 : " + c);
		  System.out.println("======================================");
		          // 변수 선언
		          String str1 = "오늘 ";
				  String str2 = "날씨는 ";
				  String str3 = "맑습니다. ";
				  int d = 100;
				  // pfrintf(); 를 출력
				  System.out.printf("%s %s %s 정수의 값은 : %d", str1, str2, str3, d);
				  System.out.println();
				  //println(); 를 출력
		          System.out.println(str1 + str2 + str3 + "정수의 값은 : " + d);
		     
	}
   // System.out.println("Helloworld"); <- 오류발생 
}
