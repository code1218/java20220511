package j22_쓰레드;

public class AutoSum extends Thread {
	
	public static int num = 0;
	private int objNumber;
	
	public AutoSum() {
		objNumber = ++num;
	}
	
	@Override
	public void run() {
		System.out.println(objNumber + "쓰레드 시작");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(objNumber + "쓰레드 종료");
	}
	
}
