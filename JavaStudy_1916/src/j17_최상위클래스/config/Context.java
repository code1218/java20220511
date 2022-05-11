package j17_최상위클래스.config;

import java.util.Scanner;

import j17_최상위클래스.controller.MainController;
import j17_최상위클래스.repository.UserArray;
import j17_최상위클래스.service.UserService;
import j17_최상위클래스.service.UserServiceImpl;
import lombok.Getter;

@Getter
public class Context {
	private static Context instance;
	private Scanner scanner;
	private MainController mainController;
	private UserService userService;
	
	private Context() {
		// 일반객체
		scanner = new Scanner(System.in);
		
		UserArray userArray = new UserArray();
		
		// 서비스 객체
		userService = new UserServiceImpl(userArray);
		
		// 컨트롤러 객체
		mainController = new MainController(userService);
	}
	
	public static Context getInstance() {
		if(instance == null) {
			instance = new Context();
		}
		return instance;
	}
}
