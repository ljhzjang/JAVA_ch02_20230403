package exer;

import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주문?");
		String order = scanner.next();
		
		int price=0;
		switch (order) {
			case "에스트레소":
			case "카푸치노":	
			case "카페라떼":
				price = 3500;
				break;

			case "아메리카노":
				price = 2000;
				break;
		default:
			System.out.println("없는 메뉴");
	
		System.out.print(order + price + "원 입니다.");
		}
	}

}
