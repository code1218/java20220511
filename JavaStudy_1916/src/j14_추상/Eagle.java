package j14_추상;

public class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 납니다.");
	}
	
	@Override
	public void eat() {
		super.eat();
	}
}
