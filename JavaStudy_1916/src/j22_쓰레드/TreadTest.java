package j22_쓰레드;

import java.util.ArrayList;

public class TreadTest {

	public static void main(String[] args) {
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		
		for(int i = 0; i < 10; i++) {
			Thread t = new Thread(new AutoSum2());
			t.start();
			threads.add(t);
		}
		
		for(int i = 0; i < threads.size(); i++) {
			Thread t = threads.get(i);
			try {
				t.join(); // 해당 쓰레드가 종료될때까지 기다려라.
			} catch (InterruptedException e) { 
				e.printStackTrace();
			}
		}
		
		System.out.println("메인 메소드 종료");

	}

}
