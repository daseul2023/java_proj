package chap04.ex01;

public class If_Statement {

	public static void main(String[] args) {
		/*
		           클래스명 : 반드시 첫자는 영문 대문자
		           변수명  : 소문자로 시작 (권장사항), 낙타형식으로 (캐멀케이스) 이름을 사용
		           상수   : 대문자로 사용 (권장사항)
		           
		              특수문자 : _, &만 사용 가능 (다른 특수문자는 오류 남)
		              숫자가 처음에 오면 오류 발생, 숫자는 사용 가능
		 */
		
		/*
		            제어문 : 프로그램의 순서를 바꿔서 처리함. 
		               if문      <- break; 가 내장
		               switch문  <- break; (블락을 빠져 나올 때 사용함)
		               
		            if  -- 3가지 구문
		            
		            1. 조건이 1개일 때         <- 삼항 연산자로 수정 (조건) ? 참 : 거짓;
		            
		               if (조건) {
		                   조건이 true 일 때 실행문;
		               }else {
		                   조건이 false 일 때 실행문;
		               }
		               
		            2. 조건이 여러개일 때
		            
		               if (조건1) {
		                     조건1일 때;
		               } else if (조건2) {
		                     조건2일 때;
		               } else if (조건3) {
		                     조건3일 때;
		               } else if (조건4) {
		                     조건4일 때;
		               } else {
		                     위의 모든 조건이 만족되지 않을 때 작동
		               }
		               
		             3. 한 라인으로 사용
		                if (조건) { 조건이 true일 때 }
		                if (조건)  조건이 true일 때 ;  <- 중괄호가 없을 때는 반드시 ; 이 들어가야함.
		                  
		 
		 
		 */
		
		// 조건이 1개일 때 : if ~ else ~
		int a = 10;
		
		if ( a < 30 ) {
			System.out.println("참입니다. ");        // 조건이 참이면 실행
			
			System.out.println("참일 때 또 실행됩니다. ");
		
		
		}else {
			System.out.println("거짓입니다. ");      // 조건이 거짓이면 실행
		}
		
		System.out.println("프로그램 종료입니다. ");
		
		
		// 조건이 여러개일 때 : 점수가 90 이상일 때 : A학점, 80점 이상일 때 : B학점, 70점 이상일 때 : C학점
		
		System.out.println("==============================");
		
		int score1 = 45 ;
		
		if ( score1 >= 90 ) {
			System.out.println("A 학점입니다. ");  // if (true) {
		}else if (score1 >= 80) {
			System.out.println("B 학점입니다. ");  // break; }
		}else if (score1 >= 70) {
			System.out.println("C 학점입니다. ");
		}else if (score1 >= 60) {
			System.out.println("D 학점입니다. ");
		}else {
			System.out.println("F 학점입니다. ");
		}
		
            System.out.println("=========if 조건에서 조건 처리===========");
            
            int score = 90 ;
            
            if ( score >= 60 &&  score < 70) {              // true && false == false
    			System.out.println("D 학점입니다. ");          // true여도 쇼트 서킷이 발생하지 않음
    		}else if (score >= 70 && score < 80) {          // true && false == false
    			System.out.println("C 학점입니다. ");
    		}else if (score >= 80 && score < 90) {          // true && false == false
    			System.out.println("B 학점입니다. ");
    		}else if (score >= 90 && score < 100) {         // true && true == true
    			System.out.println("A 학점입니다. ");
    		}else {
    			System.out.println("F 학점입니다. ");
	}
           System.out.println("===================================");
            // 조건이 true일때만 실행 : 중괄호 넣어도 되고 생략될수도 있다.
            
            if (10 > 5) {System.out.println("참입니다.");}
            
            if (10 > 5) System.out.println("10은 5보다 큽니다. ");  // alt + shift + R : 변수 이름 한꺼번에 고치려고 할 때
            // alt + shift + A : 라인의 여러값 한꺼번에 바꾸기, 커서 클릭하고 드래그해서 한꺼번에 고칠 수 있음, 다중선택
}

}
