package j11_클래스_생성자;

public class CarTest {
	
	void print() {
		System.out.println("test 출력");
	}

	public static void main(String[] args) {
//		CarTest carTest = new CarTest();
//		carTest.print();
		
		Car_J11 c1 = new Car_J11("KIA", "K5", "화이트");
		System.out.println(c1.company);
		System.out.println(c1.model);
		System.out.println(c1.color);
		

	}

}
