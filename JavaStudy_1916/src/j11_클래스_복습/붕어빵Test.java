package j11_클래스_복습;

public class 붕어빵Test {

	public static void main(String[] args) {
		붕어빵 붕어빵1 = new 붕어빵();
		붕어빵1.set재료("팥");
		붕어빵1.set모양("붕어");
		
		붕어빵 잉어빵 = new 붕어빵("슈크림", "잉어");
		
		붕어빵1.showInfo();
		잉어빵.showInfo();

	}

}
