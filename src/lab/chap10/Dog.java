package lab.chap10;

public class Dog extends Animal {                // Animal 의 자식
		
		String color;
		
		void eat() {
			System.out.println("사료를 먹습니다.");
		}
		
		void love() {
			System.out.println("사람을 좋아합니다.");
		}
}
