package chap04.ex03;

public class For_Statement3 {

	public static void main(String[] args) {
		
		// 무한루프에서 break; 를 사용해서 무한루프 빠져 나오기
		    // 반복문에서 특정 시점에 break; if 문 내에 break를 사용함. <- for, while, do while
		
		
		// for 문에서 break;
		
		for (int i = 0 ; i >= 0; i+= 10) {     // i = i + 10             <-> i += 10
			System.out.println(i);
			
			if (i == 10000) {                 // 조건을 주어서 무한루프를 빠져나옴.
				break;
			}
			
		}
		
		System.out.println("==========================");
		
		for (int i = 0 ; i >= 0; i+= 10) {     // i = i + 10             <-> i += 10
			System.out.println(i);
				break;                         // 0 , break가 걸려서 빠져나옴.
				
		//	System.out.println("오늘 ");        // if 조건문 없어서 바로 빠져나왔기 때문에 오류남.
				
			}
		
		for (int i = 0 ; i >= 0; i+= 10) {     // i = i + 10             <-> i += 10
			System.out.println(i);
			
			if ( i == 10000) 
				break;
			
			System.out.println("오늘 ");        // ...오늘 10000, if 조건문이 걸려서 break가 걸린 뒤 빠져나온게 실행됨.
				
		}
		
			
		}
		

	}



