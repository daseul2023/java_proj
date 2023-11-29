package lab.chap06;

public class Product_Test {

	public static void main(String[] args) {
		// 1. Product 객체 4개 생성
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		// 2. Setter 를 사용해서 객체의 필드의 값을 주입
		
		p1.setIdx(1);
		p1.setProName("홍길동");
		p1.setQty(100);
		p1.setYear(1994);
		p1.setProColor("노란색");
		
		p2.setIdx(2);
		p2.setProName("홍길순");
		p2.setQty(200);
		p2.setYear(1987);
		p2.setProColor("파란색");
		
		p3.setIdx(3);
		p3.setProName("홍길미");
		p3.setQty(300);
		p3.setYear(1999);
		p3.setProColor("하얀색");
		
		p4.setIdx(4);
		p4.setProName("홍길준");
		p4.setQty(400);
		p4.setYear(1984);
		p4.setProColor("분홍색");
		
		// 3. 배열 arr , 방 크기는 10개 : 0 ~ 9, 각 방에 4개의 객체를 배열 방에 넣음.
		
		Product [] arr = new Product [10];
		
		arr[0]= p1;
		arr[1]=p2;
		arr[2]=p3;
		arr[3]=p4;
		
		
		// 4. 배열의 값을 끄집어내서 Product 변수 p 에 담고 출력 : for 문 사용
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i]!= null) {
				Product p = arr[i];
				System.out.println(p);
			}
			
		}
		

	}

}
