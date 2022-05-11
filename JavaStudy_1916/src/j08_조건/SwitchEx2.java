package j08_조건;

public class SwitchEx2 {

	public static void main(String[] args) {
		int num = 20;
		
		switch(num % 2) {
			case 0:
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
		}
	}

}
