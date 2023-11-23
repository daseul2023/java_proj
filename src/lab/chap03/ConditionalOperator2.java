package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator2 {

	public static void main(String[] args) {
		// Scanner로 "안녕"이라는 문자열을 입력, "안녕" 문자열이 입력됐을 때 "안녕하세요" "안녕 못합니다." 라고 출력하기
		    // == 을 사용하면 안됨, .equals("안녕") 쓰기
		    // 삼항 연산자 사용
		
		// 내 실습
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 문자열을 입력하세요>>>");
		String str = sc.next();

		System.out.println(str.equals(str) ? "안녕하세요" : "안녕 못합니다.");
		
		// 선생님 실습
		String str1;    // 기본 자료형이 아니다. 참조 자료형이다. 변수(str1) 변수의 값이 Heap에 저장되어 있음.
		
		System.out.println("단어 하나를 입력하세요>>>");
		str1 = sc.next();
		
	//	System.out.println( (str1 == "안녕") ? "안녕하세요" : "안녕 못합니다.");  <- 이렇게 사용하면 안녕을 입력해도 false로 나오기 때문에 이렇게 사용하면 안됨.
		
		
		System.out.println( (str1.equals("안녕")) ? "안녕하세요" : "안녕 못합니다.");
		
		// 참조 자료형일 때 변수의 값은 Heap 공간에 저장됨. stack에는 변수명과 Heap에 저장된 값의 번지가 저장되어 있음
		
		
	}

}
