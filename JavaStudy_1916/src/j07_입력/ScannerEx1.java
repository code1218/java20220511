package j07_입력;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//System.out.println(in.nextInt());
		//System.out.println(in.nextLine());
		
		System.out.print("이름입력: ");
		String name = in.next();
		System.out.print("성별입력: ");
		char gender = in.next().charAt(0);
		System.out.println("이름: " + name);
		System.out.println("성별: " + gender);

	}

}
