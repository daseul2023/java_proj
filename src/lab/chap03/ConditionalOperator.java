package lab.chap03;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 스캐너 장착, 정수, % 나머지    || 연산자 사용, 삼항 연산자 사용
		
		// 1. 스캐너로 정수값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00(변수) 이고, 짝수 입니다. (홀수 입니다.)
		
		// 2. 스캐너로 값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00(변수) 이고, 3,6,9의 배수 입니다. (3,6,9의 배수가 아닙니다.)
		
		
		// 내가 한 실습
		int val1 = 6;
		System.out.println(true || ++val1 > 4);
		int val2 = ( 5 > 6 ) ? 7 : 8;
		System.out.println("인풋받은 값은 " + val1 + "이고, 짝수입니다.");
		System.out.println(val2);
		
		System.out.println(10%7);
		System.out.println("인풋받은 값은 " + 10%7 + "이고, 3,6,9의 배수입니다.");
		
		System.out.println("============================");
		
		// 선생님이 한 실습
		
		// 1. 인풋 받을 변수 선언 : 정수
		int abc;
		// 2. 스캐너로 정수 값을 인풋 받음
		System.out.println("정수값 하나를 입력하세요>>>");
		abc = sc.nextInt();
		System.out.printf("인풋받은 값은 %d 이고,", abc);
		System.out.println((abc % 2 == 0) ? "짝수입니다." : "홀수입니다.");
		
		System.out.printf("인풋받은 값은 %d 이고,", abc);
		System.out.println((abc % 3 == 0 || abc % 6 == 0 || abc % 9 == 0 ) ? "3,6,9의 배수 입니다." : "3,6,9의 배수가 아닙니다.");
		
// 스캐너 장착, 정수, % 나머지    || 연산자 사용, 삼항 연산자 사용
		
		// 1. 스캐너로 정수값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00(변수) 이고, 짝수 입니다. (홀수 입니다.)
		
		// 2. 스캐너로 값을 인풋받아서 : 출력 내용 : 인풋받은 값은 00(변수) 이고, 3,6,9의 배수 입니다. (3,6,9의 배수가 아닙니다.)
		
	}
}
