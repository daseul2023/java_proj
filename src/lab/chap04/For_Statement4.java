package lab.chap04;

public class For_Statement4 {

	public static void main(String[] args) {
		/*
		           실습 : 2중 for문을 사용해서 1 ~ 19단까지 출력, 각 단을 옆으로 출력 (printf)
		                -- 6단, 7단, 12단을 제외하고 출력하기 
		 */
		
		// 내가 한 실습
		
		int a;
		int b;
		
		for (a=1; a < 10; a++) {
		//	System.out.println("단");
			for (b=1; b <10; b++) {
				
			}
			
			if (a % 6 == 0)
				continue;
			
	
			System.out.printf("%d * %d = %d \t", a, b, a*b );
		} 
		
		// 선생님이 한 실습
		
		System.out.println("===========19단 출력==========");
		for (int i =1; i < 20; i++) {
				
				if (i == 6 || i == 7 || i == 12)
					continue;
				
				for (int j =1; j<20; j++) {
				
				System.out.printf("%d * %d = %d \t",i, j, (i*j));
			}
			System.out.println();
		}


	}

}
