package j11_클래스_복습;

public class ABTest {

	public static void main(String[] args) {
		A a = new A();
		A a2 = new A();
		B b = new B();
		
		Integer n = new Integer(100);
		int n2 = 100;
		
		System.out.println(n + n2);

		a.num = 100;
		a.num2 = 200;
		a.printNumAndNum2();
		
		a2.num = 300;
		a2.num2 = 400;
		a2.printNumAndNum2();
		
		b.str = "200";
		b.str2 = "400";
		b.printStrAndStr2();
		
		A a3 = new A(10, 20);
		a3.printNumAndNum2();
	}

}
