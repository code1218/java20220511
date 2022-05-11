package j15_인터페이스;

public class ProgramA implements StartAndStop {

	@Override
	public void printInfo() {
		System.out.println("A프로그램 관리");
		
	}

	@Override
	public void start() {
		System.out.println("A프로그램을 실행합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("A프로그램을 종료합니다.");
		
	}

}
