package j08_조건;

import java.util.Scanner;

public class IfEx4 {
	
	public static void main(String[] args) {
		int year = 0;
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도 입력: ");
		year = scanner.nextInt();
		
		if(year < 0 || year > 4000) {
			result = 2;
		}else if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			result = 1;
		}else {
			result = 0;
		}
		System.out.println("결과: " + result);
			
	}
	
}
