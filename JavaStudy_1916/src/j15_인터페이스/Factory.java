package j15_인터페이스;

public class Factory implements StartAndStop {

	@Override
	public void printInfo() {
		System.out.println("공장 관리");
		
	}

	@Override
	public void start() {
		System.out.println("공장을 가동합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("공장 가동을 멈춥니다.");
		
	}

}
