package lab.chap17.account;

import java.util.Arrays;
import java.util.List;

import chap17.ex02.Student;

public class Account {

	String name;           // 이름
	int account;           // 계좌번호
	int money = 10000;             // 자신의 계좌에 입금된 금액
	int money1;
	int money2;
	
	// 1. 필드
	List <Account> aList;
	int[]arr;
	
	// 2. 생성자
	Account (){}
	
	Account(String name, int account){this.name=name; this.account=account;}
	
	
	void nameAccount (List <Account>aList) {
		for (int i=0; i<aList.size(); i++) {
			Account a = aList.get(i);
			
			System.out.println("계좌이름은 " + a.getName() + "주소 : " + a.getAccount());
		}
	}
	
	
	void deposit (int money) {      // 입금 <-- 00원 입금 되었습니다. 계좌의 총 금액은 00원입니다.
		for (int i=0; i<aList.size(); i++) {
			Account a = aList.get(i);
			
			System.out.println(a.getMoney() + "원 입금 되었습니다. 계좌의 총 금액은 " + aList + "원입니다.");
		}
	}
	
	void withdraw (int money) {    // 출금 <-- 00원 출금했습니다. 잔고는 00원입니다.
		for (int i =0; i<aList.size(); i++) {
			Account a =aList.get(i);
			
			System.out.println(a.getMoney() + "원 출금했습니다. 잔고는 " +  aList + "원입니다.");
		}
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public List<Account> getaList() {
		return aList;
	}

	public void setaList(List<Account> aList) {
		this.aList = aList;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", account=" + account + ", money=" + money + ", aList=" + aList + ", arr="
				+ Arrays.toString(arr) + "]";
	}
	
	
	


}
