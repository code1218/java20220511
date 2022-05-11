package j08_조건;

import java.util.Scanner;

public class IfEx5 {
	
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x축 입력: ");
		x = scanner.nextInt();
		System.out.print("y축 입력: ");
		y = scanner.nextInt();
		
		if(x == 0 && y == 0) {
			System.out.println("원점");
		}else if(x > 0) {
			if(y > 0) {
				System.out.println("1사분면");
			}else if(y < 0) {
				System.out.println("4사분면");
			}else {
				System.out.println("1, 4사분면");
			}
		}else if(x < 0) {
			if(y > 0) {
				System.out.println("2사분면");
			}else if(y < 0) {
				System.out.println("3사분면");
			}else {
				System.out.println("2, 3사분면");
			}
		}else if(y > 0 && x == 0) {
			System.out.println("1, 2사분면");
		}else {
			System.out.println("3, 4사분면");
		}
			
	}
	
}
