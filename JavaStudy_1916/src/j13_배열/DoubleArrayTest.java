package j13_배열;

public class DoubleArrayTest {

	public static void main(String[] args) {
		int[][] numbers = new int[3][2];
		numbers[0][0] = 1;
		numbers[0][1] = 0;
		numbers[1][0] = 1;
		numbers[1][1] = 0;
		numbers[2][0] = 1;
		numbers[2][1] = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}

	}

}
