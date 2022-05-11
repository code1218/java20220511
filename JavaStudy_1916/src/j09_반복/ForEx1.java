package j09_반복;

import java.util.Scanner;

public class ForEx1 {

	public static void main(String[] args) {

		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			System.out.println(i + 1);
		}
		
		int j = 0;
		for(; j < 10;) {
			j++;
			System.out.println(j);
		}
		
		for(int k = 0, n = 0; k < 10 || n < 10; k++, n++) {
			System.out.println(k);
			System.out.println(n);
		}

	}

}
