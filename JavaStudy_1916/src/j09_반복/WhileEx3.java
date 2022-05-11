package j09_반복;

public class WhileEx3 {

	public static void main(String[] args) {
		int 운동장 = 0;
		
		while(운동장 < 5) {
			운동장++;
			System.out.println("운동장 " + 운동장 + "바퀴째");
			int 코끼리코 = 0;
			while(코끼리코 < 10) {
				코끼리코++;
				System.out.println("코끼리코 " + 코끼리코 + "번");
			}
		}
		
	}

}
