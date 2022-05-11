package j10_메소드;

public class MethodEx1 {
	static int sum(int x, int y) {
		return x + y;
	}
	
	static boolean oddOrEven(int num) {
		boolean result = false;
		
		if(num % 2 != 0) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		int num = sum(20, 30);
		System.out.println(num);
		boolean tAndF = oddOrEven(10);
		System.out.println(tAndF);
	}
}
