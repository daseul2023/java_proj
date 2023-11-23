package chap02.ex05;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) {
		
		// 외부의 라이브러리 사용하기 : 자바에서 만들어진 클래스의 묶음을 라이브러리
		    // import가 필요함   // java.lang 패키지의 클래스는 import 없이 바로 사용 가능
		
		System.out.println();
		String a;
		Integer b;
		Double c;
		Long d;
		
		/* Scanner : 콘솔로부터 입력 값을 받아오는 클래스 (객체)
		       - 외부 클래스 : java.lang 외부에 존재하는 클래스 <- import 가 필요함
		       - 동일한 패키지에 존재하는 클래스는 import 없이 사용 가능
		       - 동일한 패키지에 존재하지 않는 클래스는 import
		       - java.util.Scanner : 클래스의 전체 이름 : 패키지명.클래스명
		       - ctrl + shift + o : 자동으로 import 시켜줌 // import java.util.Scanner; 삭제하고 다시 생성 시
		       - 콘솔에서 값을 넣고 Enter/공백 을 넣으면 다음 스캐너에서 입력 대기
		 
		 */
		
		// 스캐너 객체 생성 
		//참조타입 객체변수명 = new (힙에 객체의 값을 저장하겠다.)
		Scanner sc = new Scanner (System.in);  // Scanner : 참조형 데이터 타입, sc : 변수(객체변수명)
		
		// 변수 선언
		String fName;  // 아버님 이름
		String mName;  // 어머님 이름
		String myName; // 내 이름
		
		System.out.println("아버님 이름을 입력하세요 >>>");
		fName = sc.next();   // sc.next() : 콘솔로부터 "문자열"을 인풋 받음, 콘솔에서 input을 대기 콘솔에서 입력 값을 넣어야 밑에 명령어가 작동됨.
		
		System.out.println("어머님 이름을 입력하세요 >>>");
		mName = sc.next();
		
		System.out.println("내 이름을 입력하세요 >>>");
		myName = sc.next();
		
		System.out.println("입력받은 아버님 이름은 : " + fName);
		System.out.println("입력받은 어머님 이름은 : " + mName);
		System.out.println("입력받은 내 이름은 : " + myName);
		
		System.out.println("================================");
		
		// 스캐너로 정수값 입력 받기 : 
		
		// 변수 선언만 됨, 값은 스캐너로 받아서 할당
		int aa;
		int bb;
		int cc;
		
		// 스캐너로 변수의 값을 할당
		System.out.println("aa bb cc 변수에 정수값을 공백으로 입력 하세요>>>>");
		
		aa = sc.nextInt();       // 콘솔에서 정수를 입력
		bb = sc.nextInt();
		cc = sc.nextInt();
		
		System.out.println("aa : " + aa + "\nbb : " + bb + "\ncc : " + cc);
		
		
		


	}

}
