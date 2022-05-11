package j12_상속;

/**
 * 
 * 오버라이딩(재정의)
 * 부모클래스, 인터페이스로 부터 상속 또는 구현을 하게된 메소드를 재정의하여 사용하는 기법.
 *
 */

public class Animal {
	
	public Animal() {
		System.out.println("부모 객체 생성");
	}
	
	public Animal(String str) {
		System.out.println(str);
	}
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
}
