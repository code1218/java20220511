package j09_반복;

import java.util.Scanner;

public class MenuEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char select = ' ';
		boolean loopFlag = true;
		
		while(loopFlag) {
			System.out.println("[점심 식사 메뉴]");
			System.out.println("1. 한식"); 
			System.out.println("2. 중식");
			System.out.println("3. 일식");
			System.out.println("q. 프로그램 종료");
			System.out.println("-----------------------");
			System.out.print("종류를 선택하세요: ");
			select = scanner.next().charAt(0);
			System.out.println();
			
			if(select == '1') {
				System.out.println("한식을 선택하셨습니다.");
				while(true) {
					System.out.println("[한식 메뉴]");
					System.out.println("1. 소고기 국밥");
					System.out.println("2. 고등어 정식");
					System.out.println("b. 뒤로가기");
					System.out.println("q. 프로그램 종료");
					System.out.println("-----------------------");
					System.out.print("메뉴를 선택하세요: ");
					select = scanner.next().charAt(0);
					System.out.println();
					
					if(select == '1') {
						System.out.println("소고기 국밥을 주문합니다.");
					}else if(select == '2') {
						System.out.println("고등어 정식을 주문합니다.");
					}else if(select == 'b') {
						break;
					}else if(select == 'q'){
						System.out.println("프로그램 종료중...");
						loopFlag = false; 
						break;
					}else {
						System.out.println("선택한 메뉴는 주문 할 수 없습니다.");
					}
					System.out.println();
				}
			}else if(select == '2') {
				System.out.println("중식을 선택하셨습니다.");
			}else if(select == '3') {
				System.out.println("일식을 선택하셨습니다.");
			}else if(select == 'q') {
				System.out.println("프로그램 종료 중...");
				break;
			}else {
				System.out.println("해당 명령은 선택할 수 없는 값입니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램이 종료되었습니다.");
		
		
	}

}
