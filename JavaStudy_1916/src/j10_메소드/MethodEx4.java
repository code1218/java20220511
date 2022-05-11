package j10_메소드;

public class MethodEx4 {
	
	/*
	 * 메소드(함수인데 클래스안에 정의를 하기 때문에 메소드라고 지칭한다.)
	 * 1. 매개변수와 리턴자료형이 없는 경우.
	 * 2. 매개변수만 있는 경우.
	 * 3. 리턴자료형만 있는 경우.
	 * 4. 매개변수와 리터자료형 모두 있는 경우.
	 * 
	 */
	
	// 1번
	static void add() {
		
	}
	
	// 2번
	static void add(int x, int y) {
		
	}
	
	// 3번
	static int add2() {
		return 0;
	}
	
	// 4번
	static int add2(int x, int y) {
		return x + y;
	}
	
	/*
	 * 메소드 오버로딩
	 * -> 매개변수의 형태가 다르면 동일한 이름의 메소드를 정의할 수 있다.
	 * 
	 */
	
	static void test() {
		
	}
	
	static void test(int num) {
		
	}
	
	static void test(String str) {
		
	}
	
	static void test(int num, int num2) {
		
	}
	
	static void test(int num, String str) {
		
	}
	
	////////////////////////////////////////////////////
	
	/*
	 * 리턴 자료형이 void 일 때, 메소드를 강제로 탈출 할 수 있는 방법.
	 * 반환 값이 없는 return을 사용하면 된다.
	 */
	
	static void oddAndEven(int num) {
		if(num % 2 == 0) {
			System.out.println("메소드 탈출");
			return;
		}
		
		System.out.println("메소드 탈출하지 않고 끝까지 실행됨.");
		
	}
	
	
	public static void main(String[] args) {
		oddAndEven(10);
	}
}





















