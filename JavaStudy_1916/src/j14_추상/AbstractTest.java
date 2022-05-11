package j14_추상;

/**
 * 
 * 추상(abstract)
 * 1. 추상 메소드(abstract method)
 * 접근 지정자와 반환 자료형 사이에 abstract 키워드가 존재하고,
 * 매개변수 뒤에 바로 ;(세미콜론)으로 끝나는 메소드.
 * 예) public abstract void test();
 * 
 * 2. 추상 클래스(abstract class)
 * 접근 지정자와 class 키워드 사이이에 abstract 키워드가 존재하고,
 * 클래스 내부에 추상 메소드가 하나라도 정의되어 있으면 무조건 추상 클래스.
 * 
 *
 */

public class AbstractTest {
	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void move() {
				System.out.println("동물이 움직입니다2.");
				
			}
		};
		
		Eagle eagle1 = new Eagle();
		Eagle eagle2 = new Eagle();
		Eagle eagle3 = new Eagle();
		
		animal.move();
	}
}











