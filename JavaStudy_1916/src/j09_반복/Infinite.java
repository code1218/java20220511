package j09_반복;

public class Infinite {

	public static void main(String[] args) {
		int i = 0;
		
		while(true) {
			System.out.println("계속 반복");
			System.out.println(i);
			i++;
			if(i == 10000) {
				break;
			}
		}

	}

}
