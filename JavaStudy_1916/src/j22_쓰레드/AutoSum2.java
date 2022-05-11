package j22_쓰레드;

public class AutoSum2 implements Runnable {
	
	public static int num = 0;
	private int objNumber;
	
	public AutoSum2() {
		objNumber = ++num;
	}
	
	@Override
	public void run() {
		System.out.println(objNumber + "쓰레드 시작");
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(objNumber + "쓰레드: " + (objNumber * (i + 1)));
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(objNumber + "쓰레드 종료");
	}
	
}
