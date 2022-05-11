package j11_클래스;

public class StudentTest {

	public static void main(String[] args) {
		new Student_J11(); //Student_J11 Object 생성(인스턴스)
		
		System.out.println(new Student_J11());
		System.out.println(new Student_J11());
		System.out.println(new Student_J11());
		
		int num = 10;
		
		Student_J11 s1 = new Student_J11();
		s1.schoolName = "부산대학교";
		s1.name = "김준일";
		System.out.println(s1.schoolName);
		
		Student_J11 s2 = new Student_J11();
		s2.schoolName = "부경대학교";
		s2.name = "김준이";
		System.out.println(s2.schoolName);
		
		Student_J11 s3 = null;
		
		//s3.goToSchool();
		
		s1.goToSchool();
		s2.goToSchool();
		

	}

}
