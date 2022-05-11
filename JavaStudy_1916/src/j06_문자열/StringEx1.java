package j06_문자열;

public class StringEx1 {

	public static void main(String[] args) {
		char fn1 = '준';
		char fn2 = '일';
		char ln = '김';
		
		String name = "김준일";
		
		System.out.println("사용자 이름(char): " + ln + fn1 + fn2);
		System.out.println("사용자 이름: " + name);

		System.out.println(name.contains("김"));
	}

}
