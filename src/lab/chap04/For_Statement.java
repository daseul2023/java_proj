package lab.chap04;

public class For_Statement {
	public static void main(String[] args) {
		/* 구구단 중에 7단만 출력 : for 문을 사용해서 
		 
		    7 * 1 = 7
		    7 * 2 = 14
		    7 * 3 = 21
		    7 * 4 = 28
		    7 * 5 = 35
		    7 * 6 = 42
		    7 * 7 = 49
		    7 * 8 = 56
		    7 * 9 = 63
		 
		 */
		// 내가 한 실습
	//	int b = 1;              // 초기에 설정할 때 고정값을 넣어줘야 함. 
		
	//	for (int a = 7; a < 64; a+= 7) {
	//		if (b >= 0 && b < 10) {
	//		System.out.printf("7 * %d = %d", b , a);
	//	 }
	//   }

	
	// 선생님이 한 실습
		
		// 첫번째 방법
	    for (int i = 1; i <10; i++) {
		System.out.println("7 * " + i + " = " + (i * 7));
 }
	
	    // 두번째 방법
	    for(int i =1, j = 7; i <10 ; i++) {
	    	System.out.println(j + " * " + i + " = " + (i * j));
	    }
	    
	    System.out.println("======탭으로 구분해서 한 라인으로 출력========");
	    
	    // 7단을 탭으로 구분해서 출력
	    for (int i =1, j = 7; i <10; i++) {
	    	System.out.printf("%d * %d = %d \t", j, i, i * j);
	    }
	                                                          // 바깥쪽으로 나와서 엔터 쳐줘야 밑에 8단이 표기됨
	    System.out.println();
	    
	    for (int i =1, j = 8; i <10; i++) {
	    	System.out.printf("%d * %d = %d \t", j, i, i * j); 
	    }
	    
	}
}
