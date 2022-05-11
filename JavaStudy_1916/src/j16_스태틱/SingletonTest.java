package j16_스태틱;

public class SingletonTest {

	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance();
		KIA factory2 = factory1;
		KIA factory3 = factory1;
		KIA factory4 = factory1;
		
		SingletonTest2 singletonTest2 = new SingletonTest2();
		
		singletonTest2.temp();
		
		System.out.println(factory1.createCar("K5").toString());
		System.out.println(factory2.createCar("스포티지").toString());
		System.out.println(factory3.createCar("쏘렌토").toString());
		System.out.println(factory4.createCar("K9").toString());
		
	}

}
