package j18_제네릭;

import java.util.Scanner;

public class SigninTest {

	public static void main(String[] args) {
		String username = null;
		String password = null;
		
		Scanner scanner = new Scanner(System.in);
		Signin signin = new Signin();
		
		System.out.println("[로그인]");
		System.out.print("아이디: ");
		username = scanner.nextLine();
		System.out.print("비밀번호: ");
		password = scanner.nextLine();
		
		String dbUsername = signin.getDbUser().getUsername();
		String dbPassword = signin.getDbUser().getPassword();
		System.out.println(
				signin.sendSigninMessage(
						dbUsername.equals(username) 
						&& dbPassword.equals(password)
				)
		);

	}

}






