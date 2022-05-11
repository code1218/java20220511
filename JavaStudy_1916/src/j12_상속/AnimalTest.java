package j12_상속;

public class AnimalTest {

	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		
		h.move();
		t.move();
		
		h.readBooks();
		t.hunting();
		
		Animal a = new Animal();
		a.move();
	}

}
