package j09_반복;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				break;
			}
			System.out.println(i);
		}
	}

}
