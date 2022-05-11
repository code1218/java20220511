package j16_스태틱;

public class Car {
	private int serialNumber;
	private String company;
	private String model;
	
	public Car() {
		
	}

	public Car(int serialNumber, String company, String model) {
		super();
		this.serialNumber = serialNumber;
		this.company = company;
		this.model = model;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [serialNumber=" + serialNumber + ", company=" + company + ", model=" + model + "]";
	}
	
	
	
}







