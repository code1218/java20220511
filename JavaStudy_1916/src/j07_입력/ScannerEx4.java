package j07_입력;

import java.util.Scanner;

public class ScannerEx4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = null;
		String b = null;
		
		System.out.print("두 문자를 입력하세요: ");
		a = sc.next();
		b = sc.nextLine();
		
		System.out.println("결과a: " + a);
		System.out.println("결과b: " + b);
	}

}
