package j04_형변환;

public class TypeConversionEx1 {

	public static void main(String[] args) {

		//문자 -> 정수
		
		//업캐스팅
		char a = 'a';
		int b = a;
		int c = 'a';
		System.out.println("문자 -> 정수: " + b);
		
		//다운캐스팅
		int d = 1000;
		char e = (char)d;
		System.out.println("정수 -> 문자: " + e);
		
		//정수 -> 실수
		
		//업캐스팅
		int f = 5000;
		double g = f;
		System.out.println("정수 -> 실수: " + g);
		
		//다운캐스팅
		double h = 30.5533;
		int i = (int)h;
		System.out.println("실수 -> 정수: " + i);
		
		
	}

}
