package j17_최상위클래스;

public class AcademyTest {
	public static void main(String[] args) {
		Academy academy = new Academy("코리아아이티아카데미", "부산지점", "IT");
		Academy academy2 = new Academy("코리아아이티아카데미", "부산지점", "IT");
		
		System.out.println("주소비교: " + (academy == academy2));
		System.out.println("hashcode 비교: " + (academy.hashCode() == academy2.hashCode()));
		System.out.println("equals 비교: " + academy.equals(academy2));
		System.out.println(academy);
		System.out.println(academy2);
		System.out.println(academy.getName());
		
	}
}
