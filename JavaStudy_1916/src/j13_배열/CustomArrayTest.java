package j13_배열;

import java.util.Scanner;

public class CustomArrayTest {

	public static void main(String[] args) {
		CustomArray array = new CustomArray();
		UserArray userArray = new UserArray(array);
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			char cmd = ' ';
			
			System.out.println("사용자 관리 프로그램");
			System.out.println("1. 사용자 추가");
			System.out.println("2. 사용자 전체 조회");
			System.out.println("q. 프로그램 종료");
			System.out.println("-----------------------------------");
			System.out.print("메뉴를 선택하세요: ");
			cmd = scanner.next().charAt(0);
			scanner.nextLine();
			
			if(cmd == '1') {
				userArray.insertName(scanner);
			}else if(cmd == '2') {
				userArray.selectNameAll();
			}else if(cmd == 'q') {
				System.out.println("프로그램 종료중...");
				
				for(int i = 0; i < 100; i++) {
					System.out.println((i + 1) + "/100");
					
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
				break;
			}else {
				
			}
		}
		
		System.out.println("프로그램이 종료되었습니다.");
		

	}

}
