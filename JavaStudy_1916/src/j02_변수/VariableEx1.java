package j02_변수;

public class VariableEx1 {

	public static void main(String[] args) {
		//논리자료형
		boolean trueAndFalse = true; //선언과 초기화
		boolean trueAndFalse2; //선언
		trueAndFalse2 = false; //초기화
		
		//논리자료형 출력
		System.out.println(trueAndFalse);
		System.out.println(trueAndFalse2);
		System.out.println("-------------------------");
		
		trueAndFalse = false;
		
		System.out.println(trueAndFalse);
		System.out.println(trueAndFalse2);
		
		System.out.println();
		
		//문자자료형
		char alphabet_a = 'a';
		char alphabet_b = 'b';
		char hangul_ga = '가';
		
		//문자자료형 출력
		System.out.println(alphabet_a);
		System.out.println(alphabet_b);
		System.out.println(hangul_ga);
		
		System.out.println();
		
		//정수자료형
		int number1 = 100;
		int number2 = 200;
		int number3 = number1 + number2;
		long number4 = 2200000000000l;
		
		//정수자료형 출력
		System.out.println(number3);
		System.out.println(number4);
		
		//실수자료형
		double number5 = 15.11122;
		
		System.out.println(number5);
		
		
		
		
		
	}

}
