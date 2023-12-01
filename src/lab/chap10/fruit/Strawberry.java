package lab.chap10.fruit;

public class Strawberry extends Fruit{         // 딸기
	
	Strawberry(){}
	Strawberry(String name, int cnt, int price){
		super.name=name;
		super.cnt=cnt;
		super.price=price;
	}
	
	@Override
	void totalPrice() {
		System.out.println(super.name +"의 전체가격 : " + (super.cnt * super.price) + "원 입니다.");
	}

}
