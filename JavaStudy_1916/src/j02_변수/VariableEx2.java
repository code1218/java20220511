package j02_변수;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		 * 문제1. 
		 * 이름: 김준일
		 * 
		 * 문자형 변수 
		 * firstName1
		 * firstName2
		 * lastName
		 * 	
		 */
		
		char firstName1 = '준';
		char firstName2 = '일';
		char lastName = '김';
		
		System.out.print("이름: ");
		System.out.print(lastName);
		System.out.print(firstName1);
		System.out.print(firstName2);
		
		System.out.println();
		
		System.out.println("이름: " + lastName + firstName1 + firstName2);
		System.out.println(lastName);
		System.out.println("" + (lastName + firstName1 + firstName2));
		
		char alphabet_a = 'a';
		System.out.println(alphabet_a + 1);
	}

}
