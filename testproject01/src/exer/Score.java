package exer;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("점수입력");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
	if(score >= 80) {
		System.out.println("우수");
	
	} else if( score >=60 ) {
		System.out.println("보통");
		
	} else {
		System.out.println("낙제");
	}
	}

}
