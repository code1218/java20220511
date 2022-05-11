package j17_최상위클래스.main;

import java.util.Scanner;

import j17_최상위클래스.config.Context;
import j17_최상위클래스.controller.MainController;

public class MainApplication {

	public static void main(String[] args) {
		Context context = Context.getInstance();
		MainController mainController = context.getMainController();
		
		Scanner scanner = context.getScanner();
		
		while(true) {
			System.out.println("[사용자 관리 프로그램]");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 전체 사용자 조회");
			System.out.println("4. 사용자 검색");
			System.out.println("q. 프로그램 종료");
			
			System.out.print("서비스를 선택해 주세요: ");
			String select = scanner.nextLine();
			
			if(select.equals("1")) {
				mainController.signup();
			}else if(select.equals("2")) {
				mainController.signin();
			}else if(select.equals("3")) {
				mainController.showUserAll();
			}else if(select.equals("4")) {
				mainController.searchUser();
			}else if(select.equals("q")) {
				for(int i = 0; i < 10; i++) {
					System.out.println("데이터 저장중...(" + (i + 1) + " / 10)");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				break;
			}else {
				System.out.println("선택하신 명령은 메뉴에 없습니다.");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료.");
	}

}
