package j17_최상위클래스;

import j16_스태틱.Student;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj = new Object();
		String toString = obj.toString();
		System.out.println(toString);
		
		Student student = new Student("김준일");
		System.out.println(student);
		System.out.println(student);
		
		User user = new User(20220001, "junil", "1234", "김준일", "skjil1218@kakao.com");
		User user2 = new User(20220001, "junil", "1234", "김준일", "skjil1218@kakao.com");
		System.out.println(user == user2);
		System.out.println(user.equals(user2));
		System.out.println(user.hashCode() == user.hashCode());
		Object o = user2;
		
		
		
	}
	
}
