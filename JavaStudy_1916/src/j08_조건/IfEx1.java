package j08_조건;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char select = ' ';
		System.out.print("오늘 할 운동을 입력해 주세요: ");
		select = scanner.next().charAt(0);
		
		//a = 축구, b = 농구, c = 골프, d = 헬스
		//해당 운동을 할줄 모릅니다.
		
		if(select == 'a') {
			System.out.println("축구");
		}else if(select == 'b') {
			System.out.println("농구");
		}else if(select == 'c') {
			System.out.println("골프");
		}else if(select == 'd') {
			System.out.println("헬스");
		}else {
			System.out.println("해당 운동을 할줄 모릅니다.");
		}
		
	}

}
