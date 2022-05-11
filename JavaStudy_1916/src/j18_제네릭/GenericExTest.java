package j18_제네릭;

public class GenericExTest {

	public static void main(String[] args) {
		GenericEx<String> ex = new GenericEx<String>();
		ex.setData("안녕");
		System.out.println(ex);

		GenericEx<Integer> ex2 = new GenericEx<Integer>();
		ex2.setData(1000);
		System.out.println(ex2);
	}

}
