package chap04.ex03;

public class For_Statement5 {

	public static void main(String[] args) {
		/*
		      반복문 (For, While, do while) 내에서 continue; break; 키워드 사용    <- if 조건을 넣어서 사용
		           - continue;  <- 아래 코드는 실행하지않고 증감식으로 이동
		           - break;     <- 반복문을 빠져나온다.
		 */
		
		// continue;
		for (int i = 1; i < 10; i++) {
			 
			if ( i% 3== 0) {     // 3의 배수일 때 true가 되면서 continue가 작동됨. continue가 있으면 아래 코드는 실행되지 않고 위에 증감식이 실행됨
				continue;        // break;는 빠져나오면서 아래 코드가 실행됨. continue; 구문은 실행되지 않아야되는 코드 앞에다 입력한다.
			}
			System.out.println("i 변수의 값 : " + i);
		}
		
		System.out.println("=======================================");
		
		for (int i = 1; i < 10; i++) {
			 
			System.out.println("i 변수의 값 : " + i);
			if ( i% 3== 0) {     
				continue;       
			}
			
			System.out.println("369의 배수에서는 출력 안됨");
			System.out.println();
		}
		
		System.out.println("======================================");
		
		// break;
		for (int i = 1; i <10; i++) {
			
			System.out.println("i 변수값 출력 : " + i);
			
			if (i == 7)break;                    // break; 하나일 때 {} 중괄호 생략 가능함.
		}

	}

}
