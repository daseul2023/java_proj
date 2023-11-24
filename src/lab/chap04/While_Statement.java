package lab.chap04;

public class While_Statement {

	public static void main(String[] args) {
		/*
		      1000부터 1까지 5씩 감소하면서 출력 : for 문, while 문으로 출력  
		 */
		
		// 내가 한 실습
		//for
		//	for (int a = 1; a < 1001; a-=5) {
		//	if (a>1)
		//	System.out.println(a);
		//}
		
		//	while
		//	int a = 1;
		//	while (a < 1001) {
		//	System.out.println(a);
		//	a-=5;
	
	    
	    // 선생님이 한 실습
	      for (int i = 1000; i > 0; i -=5) {
	    	  System.out.println("i: " + i);
	      }
	
	      int i = 1000;
	      while (i> 0) {
	    	  System.out.println("i : " + i);
	    	  i -= 5;
	      }
		


	      
	}
}

