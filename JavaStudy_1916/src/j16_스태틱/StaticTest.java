package j16_스태틱;

public class StaticTest {	
	public static void test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		StaticEx.name = "김준일";
		StaticEx2.print();
	}

}
