package j10_메소드;

import java.util.Scanner;

public class MethodEx3 {
	/*
	 * 최대 최소 구하기
	 * 값 3개를 입력받는다
	 * num1, num2, num3
	 * 
	 * max(num1, num2, num3);
	 * min(num1, num2, num3);
	 * 
	 * 최대값은 000입니다.
	 * 최소값은 000입니다.
	 */
	
	//메소드 오버로딩
	/*
	 * 1. 같은 메소드 명을 쓸 수 있다.
	 * 2. 매개변수가 다르면 정의할 수 있다.
	 * 3. return 자료형이 다르다고 해서 메소드 오버로딩을 할 수 있는 것은 아니다.
	 * 
	 */
	static int max(int num1, int num2, int num3) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		if(result < num3) {
			result = num3;
		}
		return result;
	}
	
	static int max(int num1, int num2, int num3, int num4) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		if(result < num3) {
			result = num3;
		}
		if(result < num4) {
			result = num4;
		}
		return result;
	}
	
	static int max(int num1, int num2, int num3, String num4) {
		int result = 0;
		if(num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		if(result < num3) {
			result = num3;
		}
		
		int num5 = Integer.parseInt(num4);
		
		if(result < num5) {
			result = num5;
		}
		return result;
	}
	
	static int min(int num1, int num2, int num3) {
		int result = 0;
		if(num1 < num2) {
			result = num1;
		}else {
			result = num2;
		}
		
		if(result > num3) {
			result = num3;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		
		System.out.print("네 수를 입력하세요: ");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		num4 = scanner.nextInt();
		
		System.out.println("최대값: " + max(num1, num2, num3));
		System.out.println("최대값: " + max(num1, num2, num3, "10"));
		System.out.println("최소값: " + min(num1, num2, num3));
	}
}





















