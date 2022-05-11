package j05_연산자;

public class OperationEx2 {

	public static void main(String[] args) {
		int num = 100;
		int num2 = num++;
		System.out.println("선증가: " + num2);
		num2 = num;
		System.out.println("후증가: " + num2);
		
		int a = 10;
		System.out.println("========증가========");
		System.out.println(++a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(++a);
		
		System.out.println("========감소========");
		System.out.println(--a);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		
	}

}
