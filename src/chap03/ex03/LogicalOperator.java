package chap03.ex03;

public class LogicalOperator {

	public static void main(String[] args) {
		
				/* 논리 연산자 : 결과 값으로 true/false 를 리턴 (돌려준다)            <- 아주 중요
			      && (AND) : 모두 true일 때 true
			                 true && true -> true
			                 true && false -> false
			                 false && true -> false
			                 false && false -> false
			      || (OR)  : 하나라도 true 이면 true
			                 true || true -> true
			                 true || false -> true
			                 false || true -> true
			                 false || false -> false
			      ^  (XOR) : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
			                 true ^ true -> false
			                 true ^ false -> true
			                 false ^ true -> true
			                 false ^ false -> false  
			      !  (NOT) : true 일 때 false, false 일 때 true

	 
				 */
				
				// && 연산 : 모두 true 일 때 true
				System.out.println(true && true);  // true
				System.out.println(true && false); // false
				System.out.println(false && true); // false
				System.out.println(false && false);// false
				
				System.out.println("==========================");
				// || (OR) 연산 : 하나라도 true 이면 true
				System.out.println(true || true);  // true
				System.out.println(true || false); // true
				System.out.println(false || true); // true
				System.out.println(false || false);// false
				
				System.out.println("==========================");
			    // ^ (XOR) 연산 : 앞뒤가 같을 때 false, 앞뒤의 값이 다를 때 true
				System.out.println(true ^ true);  // false
				System.out.println(true ^ false); // true
				System.out.println(false ^ true); // true
				System.out.println(false ^ false);// false
				
				System.out.println("==========================");
				System.out.println(!true);  // false
				System.out.println(!false); // true
				
				System.out.println("=============쇼트 서킷 발생 예문===============");
				// 논리 연산자는 숏트 서킷이 발생될 수 있다. 쇼트 서킷을 방지 하기 위해서 비트 연산자를 사용해서 방지할 수 있다.
				   // 앞에 연산자로만 결과 값을 유추할 수 있는 경우 뒤에 오는 값은 처리하지않고 결과를 돌려줌 
				       // AND 연산에서 앞에 false가 올 경우 숏트 서킷이 발생됨.
				       // OR 연산에서 앞에 true가 올 경우 숏트 서킷이 발생됨.
				
				// 쇼트 서킷이 발생되지않는 경우 :  && 연산에서 앞에 true가 올 때 뒤에 값을 확인 후 결과를 리턴
				                        // || 연산에서 앞에 false가 올 때 뒤에 값은 반드시 확인 후 결과를 리턴
				
				// 쇼트 서킷이 발생되는 경우 : && 연산에서 앞에 false가 올 때 뒤에 값은 무시하고 결과를 리턴
				                        // || 연산에서 앞에 true가 올 때 뒤에 값은 무시하고 결과를 리턴
				
				// && 연산에서 쇼트 서킷이 발생되는 경우
				int val10 = 3;
				
				System.out.println(false && ++val10 > 6);
				System.out.println(val10);     // 3, 앞에 false가 있기 때문에 뒤에 증산식은 무시하고 결과값 3만 도출, 쇼트 서킷이 발생됨
				
				System.out.println(true && ++val10 > 6);
				System.out.println(val10);     // 4, 앞에 true가 있어서 뒤에 증산식 도출해서 결과값과 true/false 확인하고 결과 도출됨.
				
				System.out.println();
				// || 연산에서 쇼트 서킷이 발생되는 경우
				int val11 = 3;
				
				System.out.println(true || ++val11 > 6);    
				System.out.println(val11);     // 3, 결과값 3만 도출, or 앞에 true일 때, 뒤에 값은 실행하지 않는다, 쇼트 서킷이 발생됨
				
				System.out.println(false || ++val11 > 6);
				System.out.println(val11);     // 4, 앞에 false가 있어서 뒤에 값을 실행하며 true/false 확인하고 결과 도출됨.
				
				System.out.println("===============쇼트 서킷을 방지하는 방법==================");
				
				// 비트 연산자를 사용해서 쇼트 서킷을 방지할 수 있다, & (AND), | (OR)
				    // 비트 연산, 논리 연산 (쇼트 서킷 방지할 때 사용됨)
				
				
				// AND 연산에서 쇼트 서킷 방지
				int val12 = 3;
				System.out.println(false & ++val12 > 6);  
				System.out.println(val12);     // 4, 비트 연산자가 논리 연산할때도 사용가능, & 하나만 들어있을 때는 쇼트 서킷을 방지해준 뒤 뒤에 도출값까지 실행한다.
				
				
				// OR 연산에서 쇼트 서킷 방지
				int val13 = 3;
				System.out.println(true | ++val13 > 6); // 단, 앞에 true라고 입력하면 or 연산자는 true가 하나라도 있으면 true이기에 그대로 도출됨
				System.out.println(val13);     // 4, | 하나만 들어있을 때 쇼트 서킷을 방지한 뒤 뒤에 도출값까지 실행 됨을 확인할 수 있음
				
				
			
			
				
				

	}

}
