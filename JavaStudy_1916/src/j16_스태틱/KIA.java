package j16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance;
	private String companyName;
	private int serialNumber;
	
	private KIA() {
		companyName = "KIA";
		serialNumber = LocalDate.now().getYear() * 10000;
	}
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}

	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
}








