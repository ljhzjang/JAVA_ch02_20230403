package exer;

import java.util.Scanner;

public class WonCalculator {

	final double CHANGERATE = 1309.5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("이름 입력");
		Scanner scanner = new Scanner(System.in);
		//scanner 객체가 선언됨
		
		String student_name = scanner.next();
		
		System.out.println("당신의 이름은" + student_name + "입니다");
	}

}
