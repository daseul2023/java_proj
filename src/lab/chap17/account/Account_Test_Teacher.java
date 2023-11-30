package lab.chap17.account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account_Test_Teacher {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
// 		List<Account> aList = new ArrayList<>();
		Account a = new Account(); 
		int select ; 
		String name; 
		int account; 
		int money; 
				
	out:	do {
			System.out.println("========================================");
			System.out.println("0. 계좌이름과 계좌 번호 등록");
			System.out.println("1. 입금  ");
			System.out.println("2. 출금  ");
			System.out.println("3. 종료  ");
			System.out.println("========================================");
			System.out.println("위 내용의 정수를 입력 하세요");
			select = sc.nextInt(); 
			
			switch (select) {
			case 0: 
				//기존의 계좌가 존재하면 메세지를 출력후  break; 
				if (a.name != null || a.account != 0) {
					System.out.println("당신은 계좌를 만들었어요. !!! ");
					System.out.println("입금이나 출금을 하세요. ");
					break; 
				}
				
				System.out.println("0. 계좌이름과 계좌 번호 등록항목입니다.");
				System.out.println("계좌의 이름을 입력 하세요>>>");
				name = sc.next(); 
				System.out.println("계좌의 번호를 정수로 입력 하세요>>>");
				account = sc.nextInt(); 
				
				a.setName(name);
				a.setAccount(account);
				
				System.out.println("계좌가 잘 등록 되었습니다. ");
				break; 
			case 1: 
				if (a.name == null || a.account==0) { 
					System.out.println("계좌를 먼저 등록해 주세요");
					break; 
				}
				// 입금 
				System.out.println("1. 입금을 선택 했습니다. 입금할 금액을 입력해 주세요>>  ");
				money = sc.nextInt(); 
				a.deposit(money);
				break; 
			case 2 : 
				if (a.name == null || a.account==0) { 
					System.out.println("계좌를 먼저 등록해 주세요");
					break; 
				}
				// 출금 
				System.out.println("2. 출금을 선택했습니다. 출금액을 입력하세요>>>>  ");
				money = sc.nextInt(); 
				a.withdraw(money);
				break;				
			case 3 : 	
				break out; 			
			}
			
		}while (true); 

		System.out.println("프로그램 종료");
		sc.close();
	}

}