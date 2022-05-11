package j15_인터페이스;

public class StartAndStopTest {

	public static void main(String[] args) {
		//StartAndStop startAndStop = new ProgramA();
		StartAndStop startAndStop = new Factory();
		//StartAndStop startAndStop = new Exam();
		
		startAndStop.printInfo();
		startAndStop.start();
		startAndStop.stop();
	}

}
