package j11_클래스_접근지정;

public class UserTest {

	public static void main(String[] args) {
		User_J11 u1 = new User_J11();
		u1.setUsername("junil");
		String username = u1.getUsername();
		System.out.println(username);
		System.out.println(u1.getUsername());
		
	}

}
