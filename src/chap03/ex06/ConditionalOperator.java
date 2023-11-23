package chap03.ex06;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 삼항 연산자 : if ~ else의 축약 구약
		
		//       (참 or 거짓)   ?  참일때 실행 : 거짓일때 실행
		
		// 삼항 연산자를 사용함
		int val1 = (3 > 5) ? 6 :9;  // false이므로 9, 1라인으로 처리됨
		
		System.out.println(val1);
		
		//if
		int val2;
		
		if(true) {
           val2 = 6;               // (조건) : true일 때 6이 실행됨
	    }else {
		   val2 = 9;               // (조건) : false일 때 9가 실행됨
	    }
		
		System.out.println(val2);

}
	
}