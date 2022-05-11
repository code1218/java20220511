package j09_반복;

public class WhileEx1 {

	public static void main(String[] args) {
		int i = 0;
		int result = 0;
		
		while(i < 100) {
			result += (++i);
		}
		
		System.out.println(result);
		

	}

}
