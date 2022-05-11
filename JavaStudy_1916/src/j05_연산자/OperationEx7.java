package j05_연산자;

public class OperationEx7 {

	public static void main(String[] args) {
		int a = 10;
		
		String flag = a > 5 || a % 2 == 0 ? "참" : "거짓";
		
		int b = a + 2;
		
		String flag2 = "false";
		int flag3 = 0;
		
		flag2 = a > 5 ? "참" : "거짓";
		
		if(a > 5) {
			flag3 = 5;
			flag2 = "참";
		}else {
			flag2 = "거짓";
		}
		
		
		
	}

}
