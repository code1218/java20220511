package j07_입력;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/*
		 * 이름(name): 김준일
		 * 연락처(phone): 010-9988-1916
		 * 직업(job): 강사
		 * 성별(gender): 남
		 * 나이(age): 29
		 * 주소(address): 부산광역시 동래구 사직동
		 * 이메일(email): skjil1218@kakao.com
		 * 
		 * 
		 * 고객의 이름은 김준일이고 직업은 강사입니다.
		 * 나이는 29이며 성별은 남성입니다.
		 * 연락처: 010-9988-1916
		 * 주소: 부산광역시 동래구 사직동
		 * 이메일(email): skjil1218@kakao.com
		 */
		
		Scanner input = new Scanner(System.in);
		
		String name = null;
		String phone = null;
		String job = null;
		String gender = null;
		int age = 0;
		String address = null;
		String email = null;
		
		
//		System.out.print("이름: ");
//		name = input.next();
//		System.out.print("연락처: ");
//		phone = input.next();
//		System.out.print("직업: ");
//		job = input.next();
//		System.out.print("성별: ");
//		gender = input.next();
		System.out.print("나이: ");
		age = Integer.parseInt(input.next());
//		input.nextLine();
//		System.out.print("주소: ");
//		address = input.nextLine();
//		System.out.print("이메일: ");
//		email = input.next();
		
		System.out.println("고객의 이름은 " + name + "이고 직업은 " + job + "입니다.");
		System.out.println("나이는 " + Integer.toString(age + 1) + "이며 성별은 " + gender + "성입니다.");
		System.out.println("연락처: " + phone);
		System.out.println("주소: " + address);
		System.out.println("이메일(email): " + email);
		
	}

}
