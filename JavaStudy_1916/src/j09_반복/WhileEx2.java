package j09_반복;

public class WhileEx2 {

	/*
	 * 2단
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * 2 X 3 = 6
	 * ...
	 * 2 X 9 = 18
	 */
	
	public static void main(String[] args) {
		int dan = 2;
		int num = 0;
		int result = 0;
		
		System.out.println(dan + "단");
		while(num < 9) {
			result = dan * (++num);
			System.out.println(dan + " X " + num + " = " + result);
		}
		
	}

}
