package j15_인터페이스;

public class Exam implements StartAndStop {

	@Override
	public void printInfo() {
		System.out.println("시험 관리");
		
	}

	@Override
	public void start() {
		System.out.println("시험을 시작합니다.");
		
	}

	@Override
	public void stop() {
		System.out.println("시험을 종료합니다.");
		
	}

}
