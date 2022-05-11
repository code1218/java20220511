package j16_스태틱.loopContoller;

import java.util.Scanner;

public class Main {
	public static boolean flag = true;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(Main.flag) {
			System.out.print("입력: ");
			int input = scanner.nextInt();
			if(input == 1) {
				System.out.println("계속 반복");
			}else if(input == 2){
				System.out.println("반복 중지");
				FlagController.changeFlag();
			}else {
				System.out.println("다시 입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}



