package lab.chap04;

import java.util.Scanner;

public class Do_While_Statement2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a ;     // 스캐너로 인풋 받는 변수
		
		do {
			System.out.println("==================================================================");
			System.out.println("1. 구구단 출력 || 2. 19단 출력 || 3. 1 ~1000까지 3의 배수 출력 || ");
			System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램");
			System.out.println("5. 프로그램 종료");
			System.out.println("==================================================================");
			System.out.println("위의 내용을 정수로 입력하세요 >>>");
			a = sc.nextInt();
			
			// 내가 한 실습
			if (a == 1) {
				System.out.println("1. 구구단 출력");
				// 구구단 출력 프로그램
				for ( a = 1; a < 10; a++) {
					for (int b=1; b< 10; b++) {
						System.out.printf("%d * %d = %d \t", a, b, a*b);
					}
				}
			}else if ( a ==2 ) {
				System.out.println("2. 19단 출력");
				// 19단 출력 프로그램 작성
				for (a = 1; a < 10; a++) {
					System.out.println("19 * " + a + " = " + 19*a);
				}
				
			}else if (a == 3) {
				System.out.println("3. 1 ~ 1000까지 3의 배수 출력");
				// for 문, while 문, do while 문
				for (a = 1; a<=1000; a++) {
					if (a % 3 == 0 || a % 6 == 0 || a % 9 == 0)
					System.out.println("a : " + a);
				}
				
				a=1;
				while (a <= 1000) {
					if (a % 3 ==0 || a % 6 == 0 || a % 9 == 0)
					System.out.println(a);
					a++;
				}
				
				do {
					if (a % 3 ==0 || a % 6 == 0 || a % 9 == 0)
					System.out.println(a);
					a++;
				}while (a <= 1000);
				
			}else if (a==4) {
				System.out.println("4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램"); 
				int b;
				System.out.println("10개의 정수를 입력하세요>>>");
				b = sc.nextInt();
				for (b = 0; b < 10; b++) {
					if(b % 2 == 0)
					System.out.println("10개의 정수 중 짝수의 개수는 " + b + "입니다." );
				}
				
//				int bb = 0;
//				while (bb<10) {
//					System.out.println("10개의 정수 중 짝수의 개수는 " + bb + "입니다.");
//					bb++;
//				}
//				
//				int cc = 0;
//				do {
//					System.out.println("10개의 정수 중 짝수의 개수는 " + cc + "입니다. ");
//				}while (cc<10);
				
			}else if ( a== 5) {
				System.out.println("5. 프로그램을 종료합니다.");
				break;
			}       
			      
		}while (true);
		
		sc.close();       // 메모리에서 스캐너를 제거해야한다. 메모리를 최적화 하기 위해, 무한루프 돌기 때문에

		// 선생님이 한 실습
		
				if (a == 1) {
					System.out.println("1. 구구단 출력");
					// 구구단 출력 프로그램
					for (int i =1; i <10; i++) {   // i 단을 출력하는 변수
						for (int j =1; j < 10; j++) {   // j 는 각 단에서 1 ~ 9 까지 곱하는 수
							System.out.printf("%d * %d = %d \t", i, j, (i*j));
						}
						System.out.println();
					}
				}else if ( a ==2 ) {
					System.out.println("2. 19단 출력");
					// 19단 출력 프로그램 작성
					for (int i =1; i <=19; i++) {
						for (int j=1; j <=19; j++) {
							System.out.printf("%d * %d =%d \t", i, j, (i*j));
						}
					}
				}else if (a == 3) {
					System.out.println("3. 1 ~ 1000까지 3의 배수 출력");
					System.out.println("====for 문====");
					for (int i = 1; i < 1000; i ++) {
						if (i % 3 ==0) {
							System.out.println("3의 배수 : " + i);
						}
					}
				}
					System.out.println("====while 문====");
					int b = 3;
					while ( b< 1000 ) {
						b += 3;            // b = b + 3
						System.out.println("3의 배수 (while) :" + b);
					}
					
					System.out.println("====do while 문====");
					boolean c = true; 
					int d = 1;
					
					do {
						if (d % 3 == 0) {System.out.println("3의 배수 (do while) : " + d);}
						if ( d == 1000) c= false;
						d++;
					}while(c);
					// else if (a==4) {"4. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇 개인지 출력하는 프로그램"
		 				System.out.println("10개의 정수를 공백으로 넣으세요>>>"); 
		 				
		 				int c1, count = 0;          // c1 :스캐너로 정수를 받는 변수, count : 짝수를 카운트 하는 변수
		 				for (int i =0; i <=10; i++) {
		 					c1 = sc.nextInt();      // 10번 루프 : input 값을 하당받음
		 					
		 					if (c1 <= 0) {          // 0이거나 음수는 카운트 하지 않음
		 						continue;
		 					}
		 					if (c1 % 2 == 0) {      // 짝수만 카운트 변수에 할당한다.
		 						count++;
		 					}
		 				}
		 				System.out.println("입력한 10개의 정수 중 짝수는 : " + count + "개 입니다.");
		 				

					 }
		
	}
	
	
