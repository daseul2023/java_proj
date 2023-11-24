package chap04.ex04;

public class While_Statement2 {

	public static void main(String[] args) {
		// 반복문에서 무한 루프
		
		int a = 1;
		while (a > 0) {
			System.out.println("무한 루프 작동" + a);
			
			if (a == 1000)break;
			a++;
		}
		
		// 무한 루프
		
		boolean b = true;
		while (b) {
			
			System.out.println(a);
			a++;
			
			if (a == 10000) {b = false;}
		}

	}

}
