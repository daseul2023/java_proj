package lab.chap04;

import java.util.Scanner;

public class If_Statement2 {

	public static void main(String[] args) {
		/*
		    if ~ else if,   == 
		    스캐너로 정수 값을 입력 받으세요. 자신이 가진 자산을 입력 받습니다.
		    
		    0 ~ 1000     : "버스나 지하철을 타고 다닙니다."
		    1000 ~ 10000 : "택시를 타고 다닙니다."
		    10000 ~      : "비행기를 타고 다닙니다."
		 */
		
		// 내가 한 실습
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("다음 정수를 입력하세요.>>>");
		a = sc.nextInt();
		
		if (a >= 0 && a == 1000 ) {
			System.out.println("버스나 지하철을 타고 다닙니다.");
		}else if (a >= 1000 && a == 10000){
			System.out.println("택시를 타고 다닙니다.");
	    }else if (a >= 10000){
	    	System.out.println("비행기를 타고 다닙니다.");
	    }else {
	    	System.out.println("잘못 입력했습니다.");
		}
		
		// 선생님이 진행한 실습
		
		//Scanner sc =new Scanner(System.in);
		int myMoney;
		
		System.out.println("자신의 자산을 정수로 만원 단위로 입력하세요.>>>");
		myMoney = sc.nextInt();
		
		if (myMoney >= 0 && myMoney < 1000) {
			System.out.println("버스나 지하철을 타고 다닙니다.");
		}else if (myMoney >= 1000 && myMoney < 10000) {
			System.out.println("택시를 타고 다닙니다.");
		}else if (myMoney >= 10000) {
			System.out.println("비행기를 타고 다닙니다.");
		}else {
			System.out.println("잘못된 값을 입력했습니다. 양수를 입력하세요.");
		}
			
		


	}

}
