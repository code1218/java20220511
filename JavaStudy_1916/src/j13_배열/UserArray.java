package j13_배열;

import java.util.Scanner;

public class UserArray {
	private CustomArray customArray;
	
	public UserArray(CustomArray customArray) {
		this.customArray = customArray;
	}
	
	public void insertName(Scanner scanner) {
		System.out.println("[이름 추가]");
		System.out.print("이름을 입력하세요: ");
		addName(scanner.nextLine());
	}
	
	public void selectNameAll() {
		String[] strArray = customArray.getStrArray();
		
		System.out.println("[이름 전체 조회]");
		for(int i = 0; i < strArray.length; i++) {
			System.out.println((i + 1) + "번: " + strArray[i]);
		}
		System.out.println();
	}
	
	private void addName(String name) {
		customArray.add(name);
		System.out.println("추가된 이름: ");
		System.out.println(getNameByLatestAddName());
		System.out.println();
	}
	
	private String getNameByLatestAddName() {
		String[] strArray = customArray.getStrArray();
		return strArray[strArray.length - 1];
	}
	
	
}






